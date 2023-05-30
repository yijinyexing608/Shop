package com.etc.blogtest.interceptor;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.etc.blogtest.jwt.JWTUtils;
import com.etc.blogtest.jwt.Token;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class JWTInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //请求非方法的处理
        if(!(handler instanceof HandlerMethod)){
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        //回去Method对象
        Method method = handlerMethod.getMethod();

        if(method.isAnnotationPresent(Token.class)){
            String token = request.getHeader("Authorization");
            //获取Token对象
            Token tokenAnnotation = method.getAnnotation(Token.class);
            if(tokenAnnotation.required()){
                if(token == null){
                    throw  new RuntimeException("token 无效，请登录");
                }
                try {
                    token = token.substring(7);
                    System.out.println("token = " + token);
                    JWTUtils.checkToken(token);
                    request.setAttribute("userId",JWTUtils.getUserId(token));
                } catch (TokenExpiredException e) {
                  throw new TokenExpiredException("token 超时");
                }catch (JWTVerificationException e){
                    throw new JWTVerificationException("校验失败");
                }

            }


        }


        return true;
    }
}

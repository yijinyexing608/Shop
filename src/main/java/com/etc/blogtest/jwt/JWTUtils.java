package com.etc.blogtest.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import java.util.Date;

public class JWTUtils {

    private static final long TOKEN_TIMEOUT=7*24*60*60*1000;

    private static final String SALT ="!@#123qaz";

    /**
     * 生成token方法
     * @param userId
     * @return
     */
    public static String sign(Long userId){
        Date d = new Date(System.currentTimeMillis()+TOKEN_TIMEOUT);
        //生成token
        String token = JWT.create().withClaim("userId",userId)
                .withExpiresAt(d)
                .sign(Algorithm.HMAC256(SALT));
        return token;
    }

    /**
     * 校验token
     * @param token
     * @return
     */
    public static boolean checkToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(SALT);
            JWT.require(algorithm).build().verify(token);
            return true;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("token 无效");
        } catch (JWTVerificationException e) {
            throw new JWTVerificationException("token 检验失败");
        }
    }

    /**
     * 在token中获取userId
     * @param token
     * @return
     */
    public static Integer getUserId(String token){
        Integer userId = JWT.decode(token).getClaim("userId").asInt();
        return userId;
    }

}

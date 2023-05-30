package com.etc.blogtest.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.text.SimpleDateFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ResultBody {

    private String code;
    private String msg;
    private Object result;
    private String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());

    public static ResultBody success() {
        ResultBody body = new ResultBody();
        body.setCode(ResultEnum.SUCCESS.getResultCode()).setMsg(ResultEnum.SUCCESS.getResultMsg());
        return body;
    }

    public static ResultBody success(Object result) {
        ResultBody body = new ResultBody();
        body.setResult(result);
        body.setCode(ResultEnum.SUCCESS.getResultCode()).setMsg(ResultEnum.SUCCESS.getResultMsg());
        return body;
    }

    public static ResultBody success(String msg) {
        ResultBody body = new ResultBody();
        body.setCode(ResultEnum.SUCCESS.getResultCode()).setMsg(msg);
        return body;
    }

    public static ResultBody success(String msg, Object result) {
        ResultBody body = new ResultBody();
        body.setResult(result);
        body.setCode(ResultEnum.SUCCESS.getResultCode()).setMsg(msg);
        return body;
    }

    /**
     * 执行失败
     *
     * @return
     */
    public static ResultBody error() {
        ResultBody body = new ResultBody();
        body.setCode(ResultEnum.ERROR.getResultCode()).setMsg(ResultEnum.ERROR.getResultMsg());
        return body;
    }

    public static ResultBody error(String message) {
        ResultBody body = new ResultBody();
        body.setCode(ResultEnum.ERROR.getResultCode()).setMsg(message);
        return body;
    }

}

package com.etc.blogtest.common;


public enum ResultEnum implements BaseInfoInterface{
    SUCCESS("1000","操作成功"),
    ERROR("2000","操作失败"),
    ;

    private String resultCode;
    private String resultMsg;

    ResultEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return this.resultCode;
    }

    @Override
    public String getResultMsg() {
        return this.resultMsg;
    }
}

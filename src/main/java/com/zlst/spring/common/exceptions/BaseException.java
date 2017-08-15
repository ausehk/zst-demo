package com.zlst.spring.common.exceptions;


import com.zlst.spring.common.enums.ModuleCodeEnum;

public class BaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
    public static final BaseException SYSERR_ERROR = new BaseException(500, "系统内部异常");
    public static final BaseException SYSERR_ERROR_INVALIDURLEXCEPTION = new BaseException(500, "请求路径错误");
    protected String code;
    protected String msg;

    public String getMsg() {
        return this.msg;
    }

    public String getCode() {
        return this.code;
    }

    public BaseException() {
        this.code = ModuleCodeEnum.SYSTEM_Module.getModuleCode() + ":" + 500;
        this.msg = "系统内部异常";
    }

    private BaseException(int code, String msg) {
        this.code = ModuleCodeEnum.SYSTEM_Module.getModuleCode() + ":" + code;
        this.msg = msg;
    }

}

package com.zlst.spring.common.enums;

public enum ModuleCodeEnum {
	 	BASIC_DATA_Module(1001, "基础模块"),
	    API_Module(1005, "其他模块"),
	    SYSTEM_Module(500, "其他模块");

	    private int moduleCode;
	    private String module;

	    private ModuleCodeEnum(int moduleCode, String module) {
	        this.moduleCode = moduleCode;
	        this.module = module;
	    }

	    public int getModuleCode() {
	        return this.moduleCode;
	    }
}

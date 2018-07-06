package com.common.util;

import java.util.List;

/**
 * 
 * @author wesion
 * {ret_code} 响应码： 200 -- 成功 ；其他 失败
 * {ret_info} 提示信息： 成功； 失败
 */
public class ResponseResult {
	
	// 相应成功
	private int ret_code =200;
	private String ret_info = "成功";
	private List ret_data = null;
	
	public ResponseResult() {}
	
	public ResponseResult(int ret_code, String ret_info, List ret_json) {
		this.ret_code = ret_code;
		this.ret_info = ret_info;
		this.ret_data = ret_json;
	}

	public int getRet_code() {
		return ret_code;
	}

	public void setRet_code(int ret_code) {
		this.ret_code = ret_code;
	}

	public String getRet_info() {
		return ret_info;
	}

	public void setRet_info(String ret_info) {
		this.ret_info = ret_info;
	}

	public List getRet_data() {
		return ret_data;
	}

	public void setRet_data(String ret_json) {
		this.ret_data = ret_data;
	}
}

package com.wx.dto;

/**
 * 
 * @author wesion
 * {code} 响应码： 1 -- 成功 ； 0 -- 失败
 * {message} 提示信息： 成功； 失败
 */
public class ResponseResult {
	
	// 相应成功
	private int code = 1; 
	private String message = "成功";
	
	public ResponseResult() {}
	
	public ResponseResult(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}

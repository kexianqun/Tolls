package com.wh.tolls.entity;

public class Result<T> {
	
	/**
	 * 错误码
	 */
	private String code = "";
	
	/**
	 * 提示信息
	 */
	private String message = "";
	
	/**
	 * 返回的数据
	 */
	private T data = null;

	
	public static final String CODE_SUCCESS = "1";
	public static final String CODE_FAILED = "2";
	public static final String CODE_PARTIAL_SUCCESS = "3";
	
	public Result(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public Result(String code, String message, T dat) {
		super();
		this.code = code;
		this.message = message;
		this.data = dat;
	}

	public Result() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", message=" + message + ", data=" + data + "]";
	}

}

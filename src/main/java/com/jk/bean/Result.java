package com.jk.bean;

import java.io.Serializable;

public class Result implements Serializable {

	private static final long serialVersionUID = -225252080728035796L;

	private boolean success;
	
	private String message;
	
	//返回给前台的状态码
	private Integer code;

	private String msg;

	private Object data;

	private boolean state = true;

	public Result() {
		super();
	}

	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Result [success=" + success + ", message=" + message + ", code=" + code + ", msg=" + msg + ", data="
				+ data + ", state=" + state + "]";
	}
	
	
	
}

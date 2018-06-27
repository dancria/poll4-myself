package com.briup.apps.poll.util;

public class MsgResponse {
	private Integer status;//状态码
	private String message;//
	private Object data;//封装对象
	
	public static MsgResponse success(String message,Object data){
		MsgResponse response=new MsgResponse();
		response.setMessage(message);
		response.setData(data);
		return response;	
	}	
	public static MsgResponse error(String message,Object data){
		MsgResponse response=new MsgResponse();
		response.setStatus(500);
		response.setMessage(message);
		response.setData(null);
		return response;	
	}
	
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static MsgResponse error(String message2) {
		// TODO Auto-generated method stub
		return null;
	}

}

package dz.aaa.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseController<T> {
     
	private String code;
	private List<T> data;
	
	private String message;
	private boolean success;
	
	
	
	
	public BaseController() {
		super();
	}
	public Map<String,Object>  getReturnMessage(List<T> data) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", "00001");
		map.put("data", data);
		map.put("success", true);
		return map;
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
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}

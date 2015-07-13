package com.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


/**
 *  2015-6-19
 *iterator_jsonDemo2
 *ExtJSONActionSuport.java
 */


public class ExtJSONActionSuport extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private int totalProperty = 0;// 总数
	private transient int start = 0;// 开始下标
	private transient int limit = 0;// 结尾下标
	private String jsonString = "";
	private boolean success = false;
	
	public String getJsonString() {
		return jsonString;
	}
	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	public String jsonExecute() throws Exception {
		return super.execute();
	}
	public int getTotalProperty() {
		return totalProperty;
	}
	public void setTotalProperty(int totalProperty) {
		this.totalProperty = totalProperty;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public ExtJSONActionSuport() throws Exception {

		System.out.println("ExtJSONActionSuport Exception");

	}
	
}

package com.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


/**
 * ============================================================================
 * 项目名：供应商查看系统
 * 
 * 类     名：Action基类 
 * 
 * 提     示：该类属于Action基类，类中包含最基本的信息，所有Action都统一继承了该类
 * 
 * 版权所有 2010-2011 深圳市千色店商业连锁有限公司信息部，并保留所有权利。
 * ----------------------------------------------------------------------------
 * ============================================================================
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

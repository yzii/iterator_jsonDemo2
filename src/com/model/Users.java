/**
 * 2015-6-17
 *iterator_jsonDemo1
 *Users.java
 */    
package com.model;    

import java.util.Iterator;
    
/**
 * @author zy
 *
 */
public class Users {
	/**     
	 * @author zy  
	 * @version   
	 * 2015-6-17 下午12:07:13   
	 */
	private String username;
	private String password;
	private String sex;

	public Users(){
		System.out.println("");
	}
	
	public Users(String username,String password,String sex){
		this.username=username;
		this.password=password;
		this.sex=sex;
	}
	public String toString()
	{
		return "username:"+username+","+"password:"+password+","+"sex:"+sex;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}


}

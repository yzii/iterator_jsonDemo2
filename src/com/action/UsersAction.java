/**
 * 2015-6-19
 *iterator_jsonDemo2
 *GetDataAction.java
 */    
package com.action;    

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.model.Users;
    
/**
 * @author zy
 *
 */
public class UsersAction extends ExtJSONActionSuport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**     
	 * @author zy  
	 * @version   
	 * 2015-6-19 下午12:00:54   
	 */
	private List<Users> users = new ArrayList<Users>();
	private Users user;
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	public UsersAction() throws Exception {
		super();
	}

	@SuppressWarnings("unchecked")
	public String execute() throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse();// 编制响应的格式
		response.setContentType("text/html;charset=UTF-8");
		HttpServletRequest request = ServletActionContext.getRequest();		
		Users user=new Users();
		//添加一条记录
		user.setUsername("zy");
		user.setPassword("123");
		user.setSex("男");
		users.add(user);
		
		//
		Iterator<Users>it=users.iterator();
		while(it.hasNext()){
			Users users=it.next();
			System.out.println(users);
		}
		request.getSession().setAttribute("users", users);
		request.getSession().setAttribute("users_size", users.size());
		
		List<Users> usersT;
		usersT = (List<Users>)request.getSession().getAttribute("users");
		this.setTotalProperty(Integer.parseInt(request.getSession().getAttribute("users_size").toString()));
		this.setSuccess(true);
		JSONArray array = JSONArray.fromObject(usersT);    //转换成json格式
		System.out.println("array:"+array.toString());
		System.out.println("count:"+this.getTotalProperty());
		this.setJsonString("{success:true,totalProperty:" + this.getTotalProperty() 
				+",users:"+array.toString()+"}");
		response.getWriter().write("{\"totalProperty\":" + this.getTotalProperty() + ",\"users\":"
				+ array.toString() + "}");
		return null;	
	}

}

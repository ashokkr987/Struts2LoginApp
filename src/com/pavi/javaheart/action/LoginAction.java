package com.pavi.javaheart.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pavi.javaheart.bean.User;

public class LoginAction extends ActionSupport implements SessionAware {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	private boolean isValideUser(User user) {

		if (user.getUserName().equals("pravin")
				&& user.getPassword().equals("kumbhar")) {

			return true;
		}

		else {

			return false;

		}
	}
	
	public String execute()
	{
		
		clearFieldErrors();
		
		User user=(User) session.get("user");
		
		System.out.println("user"+user);
		if(user!=null)
		{
		return SUCCESS;
		}
		else
		   {
			User u =new User(userName, password);
			System.out.println("isValideUser"+isValideUser(u));
			if(isValideUser(u))
			{
				session.put("user", u);
				return SUCCESS;
				
			}
			else {
				
				addFieldError("invalid", " Invalid User Name or Password ");
				return INPUT;
			}
			
			
		   }
		
		
	}

}

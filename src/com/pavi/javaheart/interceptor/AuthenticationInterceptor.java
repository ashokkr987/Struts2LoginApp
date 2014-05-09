package com.pavi.javaheart.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.pavi.javaheart.bean.User;

public class AuthenticationInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		 Map<String, Object> session=actionInvocation.getInvocationContext().getSession();
		 
		 User user=(User) session.get("user");
		 System.out.println("In Inteceptor"+user);
		 if(user ==null)
		 {
		   return ActionSupport.INPUT;
		 }
		 return actionInvocation.invoke(); 
	}

}

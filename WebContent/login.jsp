<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<s:div>
<s:fielderror name="invalid"/>
<s:form action="LoginAction" validate="true" method="post" >
<s:textfield name="userName" required="true" label="User Name "/>
<s:password name="password" required="true" label="Password"/>
<s:submit/> 




</s:form>
</s:div>
</body>
</html>

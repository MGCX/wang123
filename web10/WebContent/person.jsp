<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <jsp:useBean id="person" class="com.iss.entity.Person" scope="page" ></jsp:useBean>
<jsp:setProperty property="name" name="person" value="小米"/>
<jsp:setProperty property="age" name="person" value="14"/>
<jsp:setProperty property="sex" name="person" value="男"/>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
姓名：<%=person.getName() %>
年龄：<%=person.getAge() %>
性别：<%=person.getSex() %>
</body>
</html>
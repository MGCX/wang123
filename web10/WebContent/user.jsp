<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="person" class="com.iss.entity.Person" scope="page">
    </jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
person.setName("小红");
person.setAge(14);

person.setMarry(true);

%>
姓名：<%=person.getName() %>
年龄：<%=person.getAge() %>
</body>
</html>
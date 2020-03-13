<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color:red;
	}
</style>
</head>
<body>
	<f:form action="process" modelAttribute="emp">
		Name:<f:input path="name"/><f:errors path="name" cssClass="error"/><br>
		Address<f:input path="address"/><f:errors path="address" cssClass="error"/><br>
		MobileNo<f:input path="mobileNo"/><f:errors path="mobileNo" cssClass="error"/><br>
		DOB:<f:input path="dob" placeHolder="dd/MM/YYYY"/><f:errors path="dob" cssClass="error"/><br>
		<input type="submit" value="Submit">
	</f:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Age Calculated</title>
</head>
<body>
<form action="cal" method="GET">

Enter Date of Birth:<input type="date" name="date" >
<br/>
<input type="submit">
</form>
<br/><br/>
Age is:<c:out value="${age.getYears()}"/><br />
</body>
</html>
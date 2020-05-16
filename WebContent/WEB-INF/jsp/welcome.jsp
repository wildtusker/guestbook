<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table>
		<tr>
			<td>Welcome ${firstname}</td>
		</tr>
			<form:form id="postForm" modelAttribute="post" action="postProcess" method="post">
				<tr>
					<td><form:label path="postname">Title: </form:label></td>
					<td><form:input path="postname" name="postname" id="postname" /></td>
				</tr>
			
			
	 <tr>
				<td><form:label path="postdetails">Post Details : </form:label></td>
				<td><form:input path="postdetails" name="postdetails" id="postdetails" /></td>
			</tr>
	<%--
			<tr>
				<td><form:label path="post">Post Message:</form:label></td>
				<td><form:password path="post" name="post"
						id="post" /></td>
			</tr>--%>
			<tr>
				<td></td>
				<td align="left"><form:button id="submit" name="submit">Post</form:button></td>
			</tr>
				
		<tr>
		</tr> 
		</form:form>
		<tr>
			<td><a href="home.jsp">Home</a></td>
		</tr>
	</table>
</body>
</html>
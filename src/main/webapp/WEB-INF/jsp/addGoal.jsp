<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Goal</title>
</head>
<body>

<form:form commandName="goal">
	
	<form:errors path="*" cssClass="errorBlock" element="div"></form:errors>
	
	<table>
		<tr>
			<td>Enter Minutes:</td>
			<td>
				<form:input path="minutes"/>
				<form:errors path="minutes" cssClass="errorBlock" element="div"></form:errors>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit"  value="Enter Goal Minutes" />
			</td>
		</tr>
	</table>

</form:form>

</body>
</html>
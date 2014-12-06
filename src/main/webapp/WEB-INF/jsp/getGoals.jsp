<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Goals Report</title>
</head>
<body>	
	<table>
		<tr>
			<th>ID</th><th>Minutes</th>
		</tr>
		<c:forEach items="${goals}" var="goal">
			<tr>
				<td>
					${goal.id}
				</td>
				<td>
					${goal.minutes}
				</td>
				<td>
					<table>
						<tr>
							<th>Exrcecise ID</th><th>Exercises Minutes</th>
						</tr>
						<c:forEach items="${goal.exercises}" var="exercise">
							<tr>
								<td>
									${exercise.id}
								</td>
								<td>
									${exercise.minutes}
								</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</c:forEach>
	</table>	
</body>
</html>
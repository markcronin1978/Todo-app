<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>TODO items:</h1>
		
		<form method="post" action ="../todo/">
			<input name="text" type="text" value="">
			<input name="create" type="submit" value="Create">
		</form>
			<c:forEach items="${todos}" var="todo" varStatus="row">
				<form method="post" action="${todo.id}">
					<input name="_method" type="hidden" value="delete">
					<input name="delete" type="submit" value="Delete">${row.index}. 
					${todo.text}  ${todo.done} 
				</form>	 
			</c:forEach>
	</body>
</html>
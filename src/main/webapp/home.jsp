<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Add">
<input type="text" name="EmpID">EmpID<br>
<input type="text" name="EmpName">EmpName<br>
<input type="text" name="EmpEmail">EmpEmail<br>
<input type="text" name="EmpDesignation">EmpDesignation<br>
<input type="text" name="EmpRank">EmpRank<br>
<input type="text" name="EmpGrade">EmpGrade<br>
<input type ="submit"><br>

</form>

<form action="GetEmployee">
<input type="text" name="EmpID">EmpID<br>
<input type ="submit"><br>
</form>

</body>
</html>
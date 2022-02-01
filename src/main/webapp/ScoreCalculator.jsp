<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Sophiya Maharjan date: jan 31 2022 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Score Calculator</h2>
	<form action="ScoreCalculator" method="post">
		Enter name: <input type="text" name="studentName" /><br />
		<br /> Enter score of Web: <input type="text" name="web" /><br />
		<br /> Enter score of .NET: <input type="text" name="net" /><br />
		<br /> Enter score of JavaEE: <input type="text" name="jee" /><br />
		<br /> Enter score of Database: <input type="text" name="db" /><br />
		<br /> Enter score of Android: <input type="text" name="android" /><br />
		<br /> <input type="submit" value="Calculate" name="buttonValue" />
	</form>
</body>
</html>
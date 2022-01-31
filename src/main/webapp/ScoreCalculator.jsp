<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Score Calculator</h2>
	<form action="ScoreCalculator" method="post">
		Enter name: <input type="text" name="studentName"/><br/><br/>
		Enter score of English: <input type="text" name="english"/><br/><br/>
		Enter score of math: <input type="text" name="math"/><br/><br/>
		Enter score of Science: <input type="text" name="science"/><br/><br/>
		Enter score of Drawing: <input type="text" name="drawing"/><br/><br/>
		Enter score of Geography: <input type="text" name="geography"/><br/><br/>
		<input type="submit" value="Calculate" name="buttonValue"/>
	</form>
</body>
</html>
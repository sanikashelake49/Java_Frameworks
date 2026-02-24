<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Way to login Page</title>
</head>
<body bgcolor="beige" text="maroon">
${errMsg}
<form action="loginaction">
<input type="text" name="userName" placeholder="username"/>
<input type="password" name="userPwd" placeholder="password"/>
<input type="submit" value="login">
</form>

</body>
</html>
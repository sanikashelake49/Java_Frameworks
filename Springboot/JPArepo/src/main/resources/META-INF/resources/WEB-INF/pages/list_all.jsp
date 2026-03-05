<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="l" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list-all</title>
</head>
<body>
     <table border="5">
        <tr>
           <th>ID</th>
           <th>NAME</th>
        </tr>
        <l:forEach items="${list}" var="l">
        <tr>
        <td>${l.id}</td>
        <td>${l.name}</td>
        </tr>
        
        </l:forEach>
     
     </table>
</body>
</html>
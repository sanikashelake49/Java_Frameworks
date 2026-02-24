<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
 
 
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" 
   rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<meta charset="UTF-8">
<title>List Page</title>
</head>
<body>
      <div class="container">
      <div class="row justify-content-center">
      <div class="col mt-5">
      <h2 class="text-muted text-center display-6">welcome ${username}</h2>
      <hr>
      <table class="table table-striped">
        <tr>
           <th>ID</th>
           <th>loan Desc</th>
           <th>mobile no</th>
           <th>disb date</th>
           <th>next due date</th>
           <th></th>
           <th></th>
           
        </tr>
         <a:forEach items="${list}" var="l">
          <tr>
             <td>${l.loanId}</td><a href="delete">
             <td>${l.loanDesc}</td>
             <td>${l.mobileNo}</td>
             <td>${l.disbDate}</td>
             <td>${l.nextDueDate}</td>
             <td><a href="delete_loan?id=${l.loanId}" class="btn btn-danger btn-sm">DELETE</a>
             <td><a href="update_loan?id=${l.loanId}" class="btn btn-primary btn-sm">UPDATE</a>
             
         </tr>
        
         </a:forEach>
      
      </table>
    <a href="add_data" class="btn btn-primary btn-sm"><h2>Add Data</h2></a>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" 
     integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous"></script>
    
    </div>
    </div>
    </div>  

</body>
</html>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>



  
  <html>
<head>
    <style>
        body {
            background-color: yellow; 
        }
    </style>
</head>
<body>
    
    <c:choose>
  <c:when test="${!empty empData}">
  <h1 style="color:red;text-align:center">Employee Report</h1>
  <table border="1"align="center"bgcolor="cyan">
      <tr style="color:red"><th>empno</th><th>ename</th><th>job</th><th>salary</th><th>deptno</th><th>opertions</th></tr>
      <c:forEach var="emp" items="${empData}">
              <tr style="color:blue">
              <td>${emp.empno}</td>
              <td>${emp.ename}</td>
              <td>${emp.job}</td>
              <td>${emp.sal}</td>
              <td>${emp.deptno}</td>
              
              <td><a href="emp_edit?no=${emp.empno}"><img src="images/edit.jpg"width="30px"height="30px"></a>
              <a href="emp_delete?no=${emp.empno}"><img src="images/del.jpg"width="30px"height="30px"></a>
              </td>
              </tr>
              
      </c:forEach>
  </table>
  </c:when>
          <c:otherwise>
            <h1 style="color:red;text-align:center">Employee Not Found</h1>
          </c:otherwise>
</c:choose>

   <center>
   <a href="emp_add"><img src="images/add.jpg"width="40px"height="50px">Add Employee</a>&nbsp;&nbsp;&nbsp;
    <a href="./"><img src="images/home.jpg"width="40px"height="50px">Home</a>
   </center>
   
  <h2 style="color:green;text-align:center">${resultMsg}</h2>
      
</body>
</html>
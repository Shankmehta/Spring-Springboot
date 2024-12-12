<form action="emp_update" method="post">
    <input type="hidden" name="empId" value="${emp.empId}" />
    Name: <input type="text" name="empName" value="${emp.empName}" /><br/>
    Designation: <input type="text" name="empDesg" value="${emp.empDesg}" /><br/>
    Salary: <input type="text" name="empSalary" value="${emp.empSalary}" /><br/>
    <button type="submit">Update</button>
</form>

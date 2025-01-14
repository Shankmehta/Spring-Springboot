package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationsController 
{
	@Autowired
	private IEmployeeMgmtService empservice;
  @GetMapping("/")
  public String showHome()
  {
	  return "home";
  }
  @GetMapping("/report")
  public String showEmployeeReport(Map<String,Object>map)
  {
	 
	  Iterable<Employee>itEmp=empservice.getAllEmployees();
	  map.put("empData", itEmp);
	  return "show_employee_report";
  }
  @GetMapping("/emp_add")
  public String showFormForsaveEmployee(@ModelAttribute("emp")Employee emp)
  {
	  return "register_employee";
  }
  @PostMapping("/emp_add")
  public String saveEmployee(@ModelAttribute("emp")Employee emp,Map<String,Object>map)
  {
	  String msg=empservice.registerEmployee(emp);
	  Iterable<Employee>itEmp=empservice.getAllEmployees();
	  map.put("resultMsg", msg);
	  map.put("empData", itEmp);
	  return "show_employee_report";
  }


// Delete employee
@GetMapping("/emp_delete")
public String deleteEmployee(@RequestParam("empId") Integer empId, Map<String, Object> map) {
    String msg = empservice.deleteEmployee(empId);
    Iterable<Employee> itEmp = empservice.getAllEmployees();
    map.put("resultMsg", msg);
    map.put("empData", itEmp);
    return "show_employee_report";
}

// Show form for updating an employee
@GetMapping("/emp_edit")
public String showFormForUpdateEmployee(@RequestParam("empIdS") Integer empId, Map<String, Object> map) {
    Employee emp = empservice.getEmployeeById(empId);
    map.put("emp", emp);
    return "update_employee";
}

// Update employee
@PostMapping("/emp_update")
public String updateEmployee(@ModelAttribute("emp") Employee emp, Map<String, Object> map) {
    String msg = empservice.updateEmployee(emp);
    Iterable<Employee> itEmp = empservice.getAllEmployees();
    map.put("resultMsg", msg);
    map.put("empData", itEmp);
    return "show_employee_report";
}
}

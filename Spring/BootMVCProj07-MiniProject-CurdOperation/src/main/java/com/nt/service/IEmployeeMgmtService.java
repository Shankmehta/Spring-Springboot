package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public Iterable<Employee> getAllEmployees();
	public String registerEmployee(Employee emp);
	public String deleteEmployee(Integer empId);
    public Employee getEmployeeById(Integer empId);
    public String updateEmployee(Employee emp);
}

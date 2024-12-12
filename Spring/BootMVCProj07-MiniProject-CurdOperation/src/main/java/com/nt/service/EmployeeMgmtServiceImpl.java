package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepository;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService
{
    @Autowired
    private IEmployeeRepository empRepo;
	@Override
	public Iterable<Employee> getAllEmployees() {
		return empRepo.findAll();
	
	
	}
	@Override
	public String registerEmployee(Employee emp)
	{
		return "employee is saved with id value:"+empRepo.save(emp).getEmpno();
	}
	@Override
    public String deleteEmployee(Integer empId) {
        empRepo.deleteById(empId);
        return "Employee deleted successfully with ID: " + empId;
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        return empRepo.findById(empId).orElse(null);
    }

    @Override
    public String updateEmployee(Employee emp) {
        empRepo.save(emp);
        return "Employee updated successfully with ID: " + emp.getEmpno();
    }

}

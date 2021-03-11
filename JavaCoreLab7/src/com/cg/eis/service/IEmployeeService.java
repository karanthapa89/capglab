package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {

	boolean  addEmployee(Employee emp);
	boolean deleteEmployee(int empid);
	boolean updateEmployee(Employee emp);
	boolean  getEmployee(int empid);
	List<Employee>    getAllEmployees();
	
}

package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
static List<Employee>  list = null;
	
	static {
				
		list = new ArrayList<Employee>();
		
		list.add(new Employee(101, "Pranav", 80000, "Manager", "Scheme A"));
		list.add(new Employee(102, "Rushil", 60000, "Manager", "Scheme A"));
		list.add(new Employee(103, "Prem", 38000, "Programmer", "Scheme B"));
		list.add(new Employee(104, "Sanjeevi", 16000, "System Associate", "Scheme C"));
				
	}

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return list.add(emp);
	}

	@Override
	public boolean deleteEmployee(int emp) {
		// TODO Auto-generated method stub
		int index=0;
		boolean flag = false;
		for (Employee i :list)
		{
			index++;
			if(i.getEid() == emp)
				{
					flag = true;
					break;
				}
		}
		list.remove(index-1);
		return flag;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		emp.setEsal(emp.getEsal());
		emp.setEdesig(emp.getEdesig());
		emp.setIscheme(emp.getIscheme());
		int index=0;
		boolean flag = false;
		for (Employee i : list)
		{
			index++;
			if(i.getEid() == emp.getEid())
				{
					flag = true;
					break;
				}
		}
		list.set(index-1, emp);
		return flag;
	}

	@Override
	public boolean getEmployee(int empid) {
		boolean flag = false;
		for (Employee i :list)
		{
			if(i.getEid() == empid)
				{
					flag = true;
					System.out.println("Employee id :"+i.getEid()+", Name : "+i.getEname()+", Salary : "+i.getEsal()+", Designation : "+i.getEdesig()+", Insurance Scheme : "+i.getIscheme());
				}
		}
		return flag;
	}
	
	public static boolean validateEmployee(Employee emp)
	{
		
		boolean flag = false;
		if(emp.getEname().length() > 3 && emp.getEsal() >= 5000)
			flag = true;
		return flag;
	}
}
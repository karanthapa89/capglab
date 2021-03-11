package com.cg.eis.pl;
import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.service.IEmployeeService;


public class Client {

	public static void main(String[] args) {
		
		IEmployeeService service = new EmployeeServiceImpl();
		char rep;
		
		label:
		do
		{
		System.out.println("**** WELCOME TO EIS ****");
		System.out.println("1. Add Employee");
		System.out.println("2. Display All Employees");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Display Employee By Eid");
		System.out.println("6. Exit ");
		System.out.println("*************************");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();
		switch (choice)
		{
		
		case 1:
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Employee Name");
			String ename = sc2.nextLine();
			System.out.println("Enter Salary");
			String temp = sc2.nextLine();
			double salary;
			try
			{
				salary = Double.parseDouble(temp);
			}
			catch (Exception e)
			{
				System.out.println("Not a valid Salary");
				break;
			}
			Employee emp = new Employee(Client.generateEid(), ename, salary, Client.generateDesignation(salary), Client.generateIScheme(salary));
			boolean isValid = EmployeeServiceImpl.validateEmployee(emp);
			if(isValid)
			{
				if (service.addEmployee(emp))
				System.out.println("Employee added Successfully....");
			else
				System.out.println("Failed to add Employee");
			}
			else
				System.err.println("Invalid Data");
				break;
			
		case 2:
			List<Employee> list = service.getAllEmployees();
			for (Employee employee : list) 
				System.out.println(employee);
			break;
			
		case 3:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Employee id you want to update : ");
			int empid = sc.nextInt();
			System.out.println("Enter Employee name : ");
			String empName = sc1.nextLine();
			System.out.println("Enter new Salary : ");
			double empSalary = sc.nextDouble();
			Employee emp1 = new Employee(empid, empName, empSalary, Client.generateDesignation(empSalary), Client.generateIScheme(empSalary));
			service.updateEmployee(emp1);
			System.out.println("Employee details Updated");
			break;
			
		case 4 :
			System.out.println("Enter Employee id you want to Delete : ");
			int empid2 = sc.nextInt();
			service.deleteEmployee(empid2);
			System.out.println("Employee Deleted");
			break;
			
		case 5 :
			System.out.println("Enter id of the Employee you want to view : ");
			int id = sc.nextInt();
			service.getEmployee(id);
			break;
			
		case 6 :
			rep = 'n';
			System.out.println("Thank You visit again...");
			break label;
			}
		
		System.out.println("\nDo you want to continue?");
		System.out.println("Press 'y' to continue, any other key to exit....");
		rep = sc.next().charAt(0);
		
		} while (rep == 'y');
	}

	public static int generateEid() {

			double value = Math.random() * 10000;
			int id = (int) value;
			return id;
	}
		
		public static String generateDesignation(double salary) {
			String desig;
			if (salary < 5000)
				desig = "Clerk";
			else if (salary >= 5000 && salary < 20000)
				desig = "System Associate";
			else if (salary >= 20000 && salary < 40000)
				desig = "Programmer";
			else
				desig = "Manager";
			return desig;
		}
		
		public static String generateIScheme(double salary) {
			String scheme;
			if (salary < 5000)
				scheme = "No Scheme";
			else if (salary >= 5000 && salary < 20000)
				scheme = "Scheme C";
			else if (salary >= 20000 && salary < 40000)
				scheme = "Scheme B";
			else
				scheme = "Scheme A";
			return scheme;
		}
}
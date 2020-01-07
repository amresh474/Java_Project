package com.nt.learnig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.sort.Employee;

public class Employeeobject {
	
	private List<Employee> getEmployeeList1() {
	List<Employee> employeelist = new ArrayList<>();
	Employee employee1= new Employee();
	employee1.setAge("23");
	employee1.setId("1234");
	employee1.setName("Amresh");
	employeelist.add(employee1);
	Employee employee2=new Employee();
	employee2.setId("1234");
	employee2.setName("Kumar");
	employeelist.add(employee2);
	return employeelist;
	}
	
	private List<Employee>getEmployeeList2(){
		List<Employee> employeelist2 = new ArrayList<>();
		Employee employee2= new Employee();
		employee2.setAge("45");
		employee2.setId("5674");
		employee2.setName("santosh");
		employeelist2.add(employee2);
		Employee employee3= new Employee();
		employee2.setId("56740994");
		employee2.setName("Kumar");
		employeelist2.add(employee3);
		return employeelist2;
		
	}
	
}

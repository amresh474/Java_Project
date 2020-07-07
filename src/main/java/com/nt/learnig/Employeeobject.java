package com.nt.learnig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.sort.Employee;

public class Employeeobject {
	
	private List<Employee1> getEmployeeList1() {
	List<Employee1> employeelist = new ArrayList<>();
	Employee1 employee1= new Employee1();
	employee1.setAge("23");
	employee1.setId("1234");
	employee1.setName("Amresh");
	employeelist.add(employee1);
	Employee1 employee2=new Employee1();
	employee2.setId("1234");
	employee2.setName("Kumar");
	employeelist.add(employee2);
	return employeelist;
	}
	
	private List<Employee1>getEmployeeList2(){
		List<Employee1> employeelist2 = new ArrayList<>();
		Employee1 employee2= new Employee1();
		employee2.setAge("45");
		employee2.setId("5674");
		employee2.setName("santosh");
		employeelist2.add(employee2);
		Employee1 employee3= new Employee1();
		employee2.setId("56740994");
		employee2.setName("Kumar");
		employeelist2.add(employee3);
		return employeelist2;
		
	}
	
}

package hashCodeMethoed_and_equalsMethoed;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class EqualsMethodOverride {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setId(100);
		e2.setId(100);
		
		e1.setDepartment("software");
		e2.setDepartment("software");
		
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.equals(e2));
		
		Set<Employee> employees=new HashSet<Employee>();
		employees.add(e2);
		employees.add(e1);
		System.out.println(employees);
		
		
		UUID uuid=UUID.randomUUID();
//		UUID uuid1=UUID.fromString();
		System.out.println(uuid);
	}

}

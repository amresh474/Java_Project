package com.nt.streamApi;

/*
 * 	Get student with exact match name "jayesh"
	Get student with matching address "1235"
	Get all student having mobile numbers 3333.
	Get all student having mobile number 1233 and 1234
	Create a List<Student> from the List<TempStudent>
	Convert List<Student> to List<String> of student name
	Convert List<students> to String
	Change the case of List<String>
	Sort List<String>
	Conditionally apply Filter condition, say if flag is enabled then. 


	Intermediate Operations:
	
	map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
	List number = Arrays.asList(2,3,4,5);
	List square = number.stream().map(x->x*x).collect(Collectors.toList());
	filter: The filter method is used to select elements as per the Predicate passed as argument.
	List names = Arrays.asList("Reflection","Collection","Stream");
	List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
	sorted: The sorted method is used to sort the stream.
	List names = Arrays.asList("Reflection","Collection","Stream");
	List result = names.stream().sorted().collect(Collectors.toList());
	Terminal Operations:
	
	
	
	collect: The collect method is used to return the result of the intermediate operations performed on the stream.
	List number = Arrays.asList(2,3,4,5,3);
	Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
	forEach: The forEach method is used to iterate through every element of the stream.
	List number = Arrays.asList(2,3,4,5);
	number.stream().map(x->x*x).forEach(y->System.out.println(y));
	reduce: The reduce method is used to reduce the elements of a stream to a single value.
	The reduce method takes a BinaryOperator as a parameter.
	List number = Arrays.asList(2,3,4,5);
	int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.nt.student.student;

public class StreamTest {
	public static void main(String[] args) {
		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1, student2, student3);

		/*****************************************************
		 * Get student with exact match name "jayesh"
		 *****************************************************/
		Optional<Student> stud = students.stream().filter(student12 -> student12.getName().equals("Jayesh"))
				.findFirst();
//		Optional<Student> stud = students.stream()
		System.out.println(stud.isPresent() ? stud.get().getName() : "No student found");
		System.out.println("-------------------------------");
		System.out.println();

		/*****************************************************
		 * Get student with matching address "1235"
		 *****************************************************/
		Optional<Student> stud1 = students.stream()
				.filter(student123 -> student123.getAddress().getZipcode().equals("1235")).findFirst();
		System.out.println(stud.isPresent() ? stud.get().getName() : "No ZipCode found ");
		System.out.println("----------------------------------------");
		System.out.println();

		/*****************************************************
		 * Get all student having mobile numbers 3333.
		 *****************************************************/
		List<Student> stud2 = students.stream().filter(student1234 -> student1234.getMobileNumbers().stream()
				.anyMatch(x -> Objects.equals(x.getNumber(), "3333"))).collect(Collectors.toList());

		String result = stud2.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
//				  String result4 = stud3.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);
		System.out.println("------------------------------");
		System.out.println();

		/*****************************************************
		 * Create a List<Student> from the List<TempStudent>
		 *****************************************************/
		TempStudent tmpStud1 = new TempStudent("Amresh kumar", 201, new Address("12341"),
				Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));
		TempStudent tmpStud2 = new TempStudent("Khyati1", 202, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
		TempStudent tmpStud3 = new TempStudent("Kumar padu", 202, new Address("12351"),
				Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
		List<TempStudent> tempstudents = Arrays.asList(tmpStud1, tmpStud2, tmpStud3);

		List<Student> studentList = tempstudents.stream().map(student12345 -> new Student(student12345.name,
				student12345.age, student12345.address, student12345.mobileNumbers)).collect(Collectors.toList());
		System.out.println(studentList);
		System.out.println("-------------------------------");
		System.out.println();

		/*****************************************************
		 * Convert List<Student> to List<String> of student name
		 *****************************************************/
		List<String> studentName = studentList.stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(studentName);
		System.out.println("------------------------------------");
		System.out.println();

		System.out.println(studentName.stream().collect(Collectors.joining(",")));
		System.out.println(studentName.stream().collect(Collectors.joining(",", "[", "]")));
		System.out.println("--------------------");
		System.out.println();

		/*****************************************************
		 * Convert List<students> to String
		 *****************************************************/
		String name = students.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(name);
		System.out.println("--------------------");
		System.out.println();

		/*****************************************************
		 * Change the case of List<String>
		 *****************************************************/
		List<String> nameList = Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");

		nameList.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("--------------------");
		System.out.println();

		/*****************************************************
		 * Sort List<String>
		 *****************************************************/

		List<String> namesList = Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
		namesList.stream().sorted().forEach(System.out::println);
		System.out.println("--------------------");
		System.out.println();

		/*****************************************************
		 * Conditionally apply Filter condition, say if flag is enabled then
		 *****************************************************/
		boolean sortConditionFlag = true;

		Stream<Student> conditionalFilterResult = students.stream().filter(std -> std.getName().startsWith("J"));
		if (sortConditionFlag) {
			conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(Student::getName));
		}
		System.out.println("Before sorting :");
		students.forEach(s -> System.out.println(s.getName()));
		System.out.println();
		List<Student> list = conditionalFilterResult.collect(Collectors.toList());
		System.out.println("After filter and conditional sorting :");
		list.forEach(s -> System.out.println(s.getName()));

	}

}

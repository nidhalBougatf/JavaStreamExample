package edu.game.levels;

import edu.game.models.Employee;
import edu.game.utils.Data;

import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		List<Employee> employees = Data.employees();

		System.out.println("1/ Display all employees ");
		employees.stream().forEach(e -> System.out.println(e));

		System.out.println("2/ Display the employees which their names startsWith 'n' ");
		employees.stream().filter(e -> e.getName().startsWith("n")).forEach(e-> System.out.println(e));

		System.out.println("3/ Display the employees which their names startsWith 'n' & having a salary> 1000");
		  
		System.out.println("First way "); 
		employees.stream().filter(e -> e.getName().startsWith("n")).filter(e -> e.getSalary()>1000)
				.forEach(e-> System.out.println(e));
		System.out.println("Second way ");
		employees.stream().filter(e -> e.getName().startsWith("n") && e.getSalary()>1000 )
		.forEach(e-> System.out.println(e));

		System.out.println("4/ Display the employees which their names startsWith 's' sorted by salary ");
		
		System.out.println("**** First Way ");
		employees.stream().filter(e -> e.getName().startsWith("s")).sorted((e1,e2)-> e1.getSalary()- e2.getSalary()).forEach(e-> System.out.println(e));
        System.out.println("**** Second Way ");
         employees.stream().filter(e -> e.getName().startsWith("s")).sorted().forEach(e-> System.out.println(e)); // !!! add compartTO implement comparable in emlpoyee class
		
		
		 System.out.println("5/ Display the names of employees having a salary > 600 ");
		 
		System.out.println("**** First Way ");
		employees.stream().filter(e -> e.getSalary()>600).forEach(e -> System.out.println(e.getName()));
		System.out.println("**** Second Way ");
		employees.stream().filter(e -> e.getSalary()>600).map(Employee::getName) // output of this map => stream of string 
				.forEach(System.out::println); // type string 

		System.out.println("6/ Add 200 to employees having a name starting with 'm' and display all their details");

		System.out.println("**** First Way ");
		employees.stream().filter(e -> e.getName().startsWith("m")).map(e -> { e.setSalary(e.getSalary()+200);return e; }).forEach(e -> System.out.println(e));
		System.out.println("**** Second Way ");
		employees.stream().filter(e -> e.getName().startsWith("m")).forEach(e -> { e.setSalary(e.getSalary()+200);System.out.println(e);});


	}
}

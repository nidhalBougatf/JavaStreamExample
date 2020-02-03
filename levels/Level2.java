package edu.game.levels;

import edu.game.models.Employee;
import edu.game.utils.Data;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Level2 {
	public static void main(String[] args) {
	List<Employee> employees = Data.employees();

	System.out.println("1: Return number of employees which their names startWitch 'n' ");
	long nbr = employees.stream().filter(e -> e.getName().startsWith("n")).count();
        System.out.println(nbr);
				
	System.out.println("2: Return the sum of all employees salaries");
        System.out.println("First way ");
	long sum = employees.stream().mapToInt(e-> e.getSalary()).sum();
        System.out.println("Second way ");
        long sum2 = employees.stream().mapToInt(e-> e.getSalary()).summaryStatistics().getSum();
        System.out.println(sum);
		
	System.out.println("3: Return the average of salaries, of the employees which their names startsWith 's' ");	
        System.out.println("First way ");
	double average = employees.stream().filter(e -> e.getName().startsWith("s")).mapToInt(e -> e.getSalary()).average().getAsDouble();
	System.out.println("Second way ");
        System.out.println(average);
        double average2 = employees.stream().filter(e -> e.getName().startsWith("s")).mapToInt(e -> e.getSalary()).summaryStatistics().getAverage();
        System.out.println(average2);	
		
	System.out.println("4: Return a list of all employees ");	
	List<Employee> emps = employees.stream().collect(Collectors.toList());
            System.out.println(emps);
	
        
	System.out.println("5:Return a list of all employees which their names startsWith 's' ");	
	List<Employee> emps2 = employees.stream().filter(e -> e.getName().startsWith("s")).collect(Collectors.toList());
	System.out.println(emps2);	
		
        System.out.println("6: Check if there is at least one employee having a salary > 1000 ");

	boolean test = employees.stream().anyMatch(e-> e.getSalary()>1000);
        System.out.println(test);
				
        System.out.println("7: Display the first employee which his name startsWith 's'  ");
	System.out.println("First way");
	employees.stream().filter(e -> e.getName().startsWith("s")).findFirst().ifPresent(e -> System.out.println(e));       
	System.out.println("Second way");
	employees.stream().filter(e -> e.getName().startsWith("s")).limit(1).forEach(System.out::println); // limit : specify the number of elements to select
	System.out.println("Third way");
	employees.stream().filter(e -> e.getName().startsWith("s")).peek(System.out::println).findFirst();

		
	System.out.println("8:  Display the SECOND employee which his name startsWith 's'  ");
	employees.stream().filter(e -> e.getName().startsWith("s")).limit(2).skip(1).forEach(System.out::println);
        
        
 
        System.out.println("9: Display any employee having a name startsWith 'n' ");     
        employees.stream().filter(e -> e.getName().startsWith("n")).findAny().ifPresent(System.out::println);

        System.out.println("10: Check if there's an employee having a name starting with 'a' ");
        boolean x = employees.stream().anyMatch(e -> e.getName().startsWith("a"));
        System.out.println(x);
      
        System.out.println("11:  Display all unique employees  ");
        employees.stream().distinct().forEach(e->System.out.println(e));
        
        System.out.println("12: Display the employee having the maximum salary ");
        System.out.println("First way");
            Employee get = employees.stream().max((a,b) -> a.getSalary()-b.getSalary()).get();
            System.out.println(get);
        System.out.println("Second way");
        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
       
        
                
		

	}
}

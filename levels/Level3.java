
package edu.game.levels;

import edu.game.models.Employee;
import edu.game.utils.Data;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Level3 {
	public static void main(String[] args) {
	List<Employee> employees = Data.employees();
		

        System.out.println("1: Return a string containing all employees names ");
        System.out.println("First way");
	String names = employees.stream().map(e->e.getName()).reduce((a,b) -> a+" "+b).get(); 
        System.out.println(names);
        System.out.println("Second way");
        String names1 = employees.stream().map(e->e.getName()).reduce("@@",(a,b) -> a+" "+b);
        System.out.println(names1);                                                 
	// reduce (binaryoperator): return optional<string>
        // reduce (string identity, binaryoperator) : return string 	

        
        
        
	System.out.println("2: Return a string containing all uppercase names seperated by # ");	
	System.out.println("First way");
        String namesMajSplit = employees.stream().map(e->e.getName().toUpperCase()).reduce((a,b) -> a+"#"+b).get(); 
        System.out.println(namesMajSplit);
        System.out.println("Second way");
        String namesMajSplit2 = employees.stream().map(e->e.getName()).reduce((a,b) -> a+"#"+b).get().toUpperCase();
        System.out.println(namesMajSplit2);
        System.out.println("Third way");
        String namesMajSplit3 = employees.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.joining("#"));
        System.out.println(namesMajSplit3);
        
        
	System.out.println("3: Return set of employees ");
	Set<Employee> emps= employees.stream().collect(Collectors.toSet());
        System.out.println(emps);
        
        
	System.out.println("4: Return a set of employees sorted by name ");
        System.out.println("First way");
	TreeSet<Employee> emps2 = employees.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(emps2);                                                // () -> new TreeSet<>
        System.out.println("Second way");                                             
        TreeSet<Employee> emps3 = employees.stream().collect(Collectors.toCollection(()-> new TreeSet<> ((e1,e2) -> e1.getName().compareTo(e2.getName()))));
        System.out.println(emps3);
        
        
	System.out.println("5: Return a map containing employees grouped by salary ");
	Map<Integer, List<Employee>> mapp = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
	System.out.println(mapp);
        
        
	System.out.println("6: Return a map containing employees NAMES grouped by salary ");
        System.out.println("First way");
        Map<Integer, String> mapp2 = employees.stream().collect(Collectors.toMap(Employee::getSalary,Employee::getName,(a,b) -> a+", "+b));
        System.out.println(mapp2);
        System.out.println("Second way");
	Map<Integer, String> mapp3 = employees.stream().collect(Collectors.toMap(Employee::getSalary,Employee::getName,(oldValue, newValue)  ->  String.join(", ", oldValue,  newValue)));
        System.out.println(mapp3);

        
        
	System.out.println("7: Return  min, max,average, sum,count of salaries");
        String s = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).toString();
	String s2 = employees.stream().mapToInt(e->e.getSalary()).summaryStatistics().toString();
        
	System.out.println(s);
        System.out.println(s2);

	}
}

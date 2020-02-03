package edu.game.utils;

import java.util.ArrayList;
import java.util.List;

import edu.game.models.Employee;


public class Data {
	public static List<Employee> employees() {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee("michel", "blueWorker", 100);
		Employee e2 = new Employee("nicolas", "blueWorker", 100);
		Employee e3 = new Employee("kevin", "blueWorker", 150);
		Employee e4 = new Employee("krizistof", "blueWorker", 150);
		Employee e5 = new Employee("hodel", "blueWorker", 100);
		Employee e6 = new Employee("sara", "teacher", 700);
		Employee e7 = new Employee("saly", "teacher", 900);
		Employee e8 = new Employee("wijnaldum", "teacher", 900);
		Employee e9 = new Employee("maria", "teacher", 900);
		Employee e10 = new Employee("ibrahim", "teacher", 900);
		Employee e11 = new Employee("barney", "teacher", 1000);
		Employee e12 = new Employee("wisley", "teacher", 900);
		Employee e13 = new Employee("ivan", "teacher", 1000);
		Employee e14 = new Employee("naggui", "responsable", 1100);
		Employee e15 = new Employee("hodel", "responsable", 1000);
		Employee e16 = new Employee("barbatov", "responsable", 1000);
		Employee e17 = new Employee("maria", "responsable", 900);
		Employee e18 = new Employee("marry", "responsable", 900);
		Employee e19 = new Employee("zayen", "responsable", 1200);
		Employee e20 = new Employee("soufian", "responsable", 1200);
		Employee e21 = new Employee("khabib", "Administrator", 2100);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		employees.add(e11);
		employees.add(e12);
		employees.add(e13);
		employees.add(e14);
		employees.add(e15);
		employees.add(e16);
		employees.add(e17);
		employees.add(e18);
		employees.add(e19);
		employees.add(e20);
		employees.add(e21);

		return employees;
	}
}

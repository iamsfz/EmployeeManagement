package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeMain {

	public static void main(String args[]) {
		EmployeeMain project = new EmployeeMain();
		project.start();

	}

	public void start() {
		Employee employees[] = new Employee[4];

		Department department1 = new Department("Dp81", "Developer");
		Department department2 = new Department("Dp18", "Developer");
		Department department3 = new Department("T001", "Tester");
		Department department4 = new Department("T008", "Tester");

		Developer developer1 = new Developer(12, "sfz", department1, "java");
		Developer developer2 = new Developer(18, "mfj", department2, "oracle");

		Tester tester1 = new Tester(07, "xdd", department3, "sts");
		Tester tester2 = new Tester(21, "xxp", department4, "vs code");

		employees[0] = developer1;
		employees[1] = developer2;
		employees[2] = tester1;
		employees[3] = tester2;

		for (int i = 0; i < employees.length; i++) {

			Employee details = employees[i];
			if (details instanceof Developer) {
				Developer developer = (Developer) details;
				displayEmployee(developer);
			}
			if (details instanceof Tester) {
				Tester tester = (Tester) details;
				displayEmployee(tester);
			}
		}

	}

	void displayBaseEmployee(Employee employee) {
		int id = employee.getId();
		String name = employee.getName();
		Department department = employee.getDepartment();
		String departmentId = department.getDepartmentId();
		String departmentName = department.getDepartmentName();
		System.out.println("CustomerID:" + id + " Name: " + name);
		System.out.println("DepartmentID:" + departmentId + " Department Name:" + departmentName);

	}

	void displayEmployee(Developer employee) {
		displayBaseEmployee(employee);
		String languages = employee.getLanguage();
		System.out.println("Language=" + languages);
	}

	void displayEmployee(Tester employee) {
		displayBaseEmployee(employee);
		String tool = employee.getTool();
		System.out.println("Tool:" + tool);
	}

}
package Employee_Wage_Computation;

import java.util.Random;

public class Employee_Wage {
	static int isPresent;
	static int wage_Per_Hour = 20;
	static int full_Day_Hour = 8;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		System.out.println();

		Employee_Wage emp = new Employee_Wage();

		emp.employeeAttendance();
		emp.dailyEmployeeWage();

	}

	// employee attendance check
	public void employeeAttendance() {
		Random inp = new Random();
		isPresent = inp.nextInt(2);

		System.out.println("Attendance : ");
		if (isPresent == 0)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		System.out.println();
	}

	// calculate employee wage
	public void dailyEmployeeWage() {
		int dailyWage1;

		dailyWage1 = full_Day_Hour * wage_Per_Hour;
		System.out.println("Calculate Daily Employee Wage : ");
		System.out.println("Employee is Full Time");
		System.out.println("Daily wage of Employee is " + dailyWage1 + " Rs ");
		System.out.println();
	}
}

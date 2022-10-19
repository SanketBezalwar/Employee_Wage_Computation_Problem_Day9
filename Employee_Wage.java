package Employee_Wage_Computation;

import java.util.Random;

public class Employee_Wage {

	public static int isPresent;
	public static int wage_Per_Hour = 20;
	public static int full_Day_Hour = 8;
	public static int part_Time_Hour = 4;
	public static final int isFullTime = 0;
	public static final int isPartTime = 1;

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
		int dailyWage2;
		int monthlyWage1;
		int monthlyWage2;
		int workDays = 20;

		dailyWage1 = full_Day_Hour * wage_Per_Hour;
		dailyWage2 = part_Time_Hour * wage_Per_Hour;

		monthlyWage1 = dailyWage1 * workDays;
		monthlyWage2 = dailyWage2 * workDays;

		System.out.println("Calculate Employee Wage : ");
		System.out.println();

		Random inp = new Random();
		isPresent = inp.nextInt(3);

		switch (isPresent) {
		case 0:
			System.out.println("Employee is Full Time");
			System.out.println("Daily Wage of Employee is " + dailyWage1 + " Rs ");
			System.out.println("Monthly Wage of Employee is " + monthlyWage1 + " Rs ");
			break;

		case 1:
			System.out.println("Employee is Part Time");
			System.out.println("Daily Wage of Employee is " + dailyWage2 + " Rs ");
			System.out.println("Monthly Wage of Employee is " + monthlyWage2 + " Rs ");
			break;

		case 2:
			System.out.println("Employee is Absent");
			break;
		}

	}

	// wages till hours or days is reached
	public void wageDaysHours() {
		int isWorking;
		int totalWage = 0;
		int maxWorkDays = 0;
		int maxWorkHours = 0;

		while (maxWorkHours <= 100 && maxWorkDays <= 20) {
			maxWorkDays++;

			Random inp = new Random();
			isWorking = inp.nextInt(2);
			maxWorkDays++;

			switch (isWorking) {
			case 0:
				totalWage += wage_Per_Hour * 4;
				maxWorkHours += 4;
				break;

			case 1:
				totalWage += wage_Per_Hour * 8;
				maxWorkHours += 8;
				break;
			}

		}

		System.out.println("Employee Wage for Total Working Hours is " + totalWage);
		System.out.println();

	}

	// wages of multiple companies
	public static int calculateEmployeeWage(String companyName, int employeeRatePerHour, int numOfWorkingDays,
			int maxHoursInMonth) {

		int employeeHours = 0, totalEmployeeHours = 0, totalWorkingDays = 0;

		while (totalEmployeeHours <= maxHoursInMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;

			Random inp = new Random();
			isPresent = inp.nextInt(3);

			switch (isPresent) {
			case isFullTime:
				employeeHours = 8;
				break;

			case isPartTime:
				employeeHours = 4;
				break;

			default:
				employeeHours = 0;
			}

			totalEmployeeHours += employeeHours;

			System.out.println("Day " + totalWorkingDays + " Working Hours : " + employeeHours);
		}

		int totalEmployeeWage = totalEmployeeHours * employeeRatePerHour;

		System.out.println();
		System.out.println("Total Employee Wage for " + companyName + " is : " + totalEmployeeWage);
		System.out.println();

		return totalEmployeeWage;

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");
		System.out.println();

		Employee_Wage emp = new Employee_Wage();

		emp.employeeAttendance();
		emp.dailyEmployeeWage();
		emp.wageDaysHours();

		System.out.println("Calculate Total Employee Wage For Multiple Companies");
		System.out.println();

		calculateEmployeeWage("Jio Mart", 10, 6, 16);
		calculateEmployeeWage("Zudio", 15, 10, 20);
		calculateEmployeeWage("Lenskart", 20, 14, 24);

	}

}

public class SalaryCalculator {
	//assuming that hra is fixed for all employees and allowance is 10% of basic salary.
	static double hra = 20000;
	public static double getSalary(Employee emp) {
		double salary = 0.0;
		
	// Complete the logic
		double allowance = getAllowance(emp);
		salary = emp.empSalary + allowance + hra;
		
		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowance = 0.0;

	// Complete the logic
		allowance = (0.1)*emp.empSalary;

		return allowance;
	}
}

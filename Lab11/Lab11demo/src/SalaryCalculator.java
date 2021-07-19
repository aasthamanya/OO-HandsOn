public class SalaryCalculator {
	public static double getSalary(double basic,double hra,double allowance_percent) {
		double salary = 0.0;
		
	// Complete the logic
		double allowance = getAllowance(allowance_percent,basic);
		salary = basic + allowance + hra;
		return salary;
	}
	public static double getAllowance(double p,double basic) {
		double allowance = 0.0;

	// Complete the logic
		allowance = (p/100)*(basic);

		return allowance;
	}
}

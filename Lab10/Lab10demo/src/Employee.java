public class Employee {
	
	// Identity variables of Employee 
	String empId, name;
	int empRoleId;
	double basic,hra,allowance_percent;
	Employee(String id, String name,int roleId, double basic,double p,double hra)
	{
		this.empId = id;
		this.empRoleId = roleId;
		this.basic = basic;
		this.name = name;
		this.allowance_percent = p;
		this.hra = hra;
	}
	
	// Create getter and setter methods
	/*public void setEmpId(String id)
	{
		this.empId = id;
	}
	public void setEmpName(String name)
	{
		this.name = name;
	}*/
	public String getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return name;
	}
	public int getRoleId()
	{
		return empRoleId;
	}
	public double getSalary()
	{
		SalaryCalculator sc = new SalaryCalculator();
		double sal = sc.getSalary(basic, hra, allowance_percent);
		return sal;
	}
	public double getAllowance()
	{
		SalaryCalculator sc = new SalaryCalculator();
		double allowance = sc.getAllowance(allowance_percent, basic);
		return allowance;
	}
	
}





















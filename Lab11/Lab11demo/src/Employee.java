public class Employee {
	
	// Identity variables of Employee 
	String empId, name;
	int empRoleId;
	double basic,hra,allowance_percent;
	// Create getter and setter methods
	public void setEmpId(String id)
	{
		this.empId = id;
	}
	public void setEmpName(String name)
	{
		this.name = name;
	}
	public void setRoleID(int roleId)
	{
		this.empRoleId = roleId;
	}
	public void setBasic(double basic)
	{
		this.basic=basic;
	}
	public void setHra(double hra)
	{
		this.hra = hra;
	}
	public void setAllowancePercent(double p)
	{
		this.allowance_percent = p;
	}
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
	public String getRoleDesc()
	{
		RoleBuilder rb = new RoleBuilder();
		String role = rb.getRoleDescription(empRoleId);
		return role;
	}
	
}





















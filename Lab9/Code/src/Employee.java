public class Employee {
	
	// Identity variables of Employee 
	String empId, name;
	int empRoleId;
	double empSalary;
	Employee(String id, String name,int roleId, double sal )
	{
		this.empId = id;
		this.empRoleId = roleId;
		this.empSalary = sal;
		this.name = name;
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
		return empSalary;
	}
	
}





















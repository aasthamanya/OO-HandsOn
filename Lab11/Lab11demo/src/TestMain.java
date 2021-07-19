public class TestMain {
	public static void main(String[] args) {
		
		Console c = new Console();
		int n;
		System.out.println("Enter number of employees: ");
		n = c.readInt();
		Employee employees[] = new Employee[n];
		for(int i=0;i<n;i++)
		{
			Employee emp = new Employee();
			System.out.printf("Enter employee %d details\n",i+1);
			System.out.println("Enter name: ");
			String name = c.readLine();
			emp.setEmpName(name);
			System.out.println("Enter Employee id: ");
			String empid = c.readLine();
			emp.setEmpId(empid);
			System.out.println("Enter Employee role id: ");
			int roleid = c.readInt();
			emp.setRoleID(roleid);
			System.out.println("Enter Employee basic salary: ");
			double basic = c.readDouble();
			emp.setBasic(basic);
			System.out.println("Enter Employee HRA amount: ");
			double hra = c.readDouble();
			emp.setHra(hra);
			System.out.println("Enter Employee allowance percent: ");
			double p = c.readDouble();
			emp.setAllowancePercent(p);
			employees[i] = emp;
		}

		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport er = new EmployeeReport(dtReport);
	// Invoke display() method by passing the employee array
		er.display(employees);
	}		
}



















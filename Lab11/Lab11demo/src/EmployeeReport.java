public class EmployeeReport {
	private String dtReport;
	EmployeeReport(String dtReport){
		this.dtReport = dtReport;
	}
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		
		// Complete the logic 	
		for(int i=0;i<empArr.length;i++)
		{
			Employee emp = empArr[i];
			String role = emp.getRoleDesc();
			String eid = emp.empId;
			String name = emp.name;
			double basic = emp.basic;
			double hra = emp.hra;
			double p= emp.allowance_percent;
			double allowance = emp.getAllowance();
			double salary = emp.getSalary();
			System.out.printf("%s\t%s\t%s\t%f\t%f\t%f\t%f\n",name,eid,role,basic,hra,allowance,salary);
		}
		
		displayFooter(empArr.length);
		
	}

	public String getDtReport() {
		return dtReport;
	}
}
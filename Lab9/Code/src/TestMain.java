public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		Employee emp1 = new Employee("11AA","John",2,560000);
		Employee emp2 = new Employee("22AA","Alice",3,570000);
		Employee emp3 = new Employee("33AA","David",4,580000);
		Employee emp4 = new Employee("44AA","Jane",0,590000);
		Employee employees[] = new Employee[4];

	// Assign objects of Employee to employees declared above
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp4;
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport er = new EmployeeReport();
		er.setDtReport(dtReport);
	// Invoke display() method by passing the employee array
		er.display(employees);
	}		
}



















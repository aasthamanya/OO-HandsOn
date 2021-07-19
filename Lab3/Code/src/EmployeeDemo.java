public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}

	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		String empId = Console.readLine();
		
		System.out.println("Enter Name : ");
		String name = Console.readLine();
		
		System.out.println("Address Line1 : ");
		String addrLine1 = Console.readLine();
		
		System.out.println("Address Line2 : ");
		String addrLine2 = Console.readLine();
		
		System.out.println("Address City : ");
		String city = Console.readLine();
		
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		
		emp.storeData(empId, name, addrLine1, addrLine2, city, pin);
	}
	public static void showData(Employee emp) {
		
		System.out.println("Emp Id : "+emp.empId);
		System.out.println("Name : "+emp.name);
		System.out.println("--------------------------------------------");
		System.out.println("Addr Line1 : "+emp.addr.address1);
		System.out.println("Addr Line2 : "+emp.addr.address2);
		System.out.println("City : "+emp.addr.city);
		System.out.println("Pin : "+emp.addr.pin);
		System.out.println("--------------------------------------------");
	}
}















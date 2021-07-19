public class Employee {

// Identity variables and methods. Create association with Address
	String empId,name;
	Address addr = new Address();
	public void storeData(String id, String name,String addr1, String addr2,String city, String pin)
	{
		this.empId = id;
		this.name = name;
		addr.setAddress(addr1, addr2, city, pin);	
	}

}

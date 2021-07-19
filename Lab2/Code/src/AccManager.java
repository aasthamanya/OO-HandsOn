
public class AccManager {
	public void fillAccountData(Account a1) {
	
	//Complete the statements
		Console sc = new Console();
		System.out.println("Enter Account Number: ");
		String accno = sc.readLine();
		System.out.println("Enter Name: ");
		String name = sc.readLine();
		System.out.println("Enter Balance: ");
		double bal = sc.readDouble();
		a1.setAccNo(accno);
		a1.setName(name);
		a1.setBalance(bal);
		}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}

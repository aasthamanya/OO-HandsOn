public class ResultFinder {
	private int m1;
	private int m2;
	private int m3;
	
	// Create setter and getter methods 
	public void setMarks(int x,int y, int z)
	{
		this.m1 = x;
		this.m2 = y;
		this.m3 = z;
	}
	public int getMarks1()
	{
		return m1;
	}
	public int getMarks2()
	{
		return m2;
	}
	public int getMarks3()
	{
		return m3;
	}

	public void displayMarks() {

		System.out.println("Marks in subject 1: "+m1);
		System.out.println("Marks in subject 2: "+m2);
		System.out.println("Marks in subject 3: "+m3);
	}
	public int getTotal() {
		int total = m1+m2+m3;
		return total;
	}
	public double getAverage() {
		int avg = (m1+m2+m3)/3;
		return avg;
	}
	
	public String getResult() {
		if((m1+m2+m3)>=50)
			return "Pass";
		else
			return "Fail";

	}
}

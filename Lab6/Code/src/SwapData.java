public class SwapData {
	private int arg1;
	private int arg2;

	public void swapValues() {

	//Logic to swap values
	arg1= arg1^arg2;
	arg2 = arg1^arg2;
	arg1 = arg1^arg2;
	}

	public void displayValues(String str) {

	//Display string message with values of arg1 and arg2
		System.out.println(str);
		System.out.println("Value 1: "+arg1);
		System.out.println("Value 2: "+arg2);

	}
	public void setValues(int x,int y)
	{
		this.arg1 = x;
		this.arg2 = y;
	}
	public int getValue1()
	{
		return arg1;
	}
	public int getValue2()
	{
		return arg2;
	}
	

// Create setter and getter methods 

}

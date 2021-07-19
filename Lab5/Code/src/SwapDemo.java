public class SwapDemo {
	public static void main(String[] args) {
		int arg1 = 100;
		int arg2 = 200;
	// make call to swapValues() and displayValues()
		displayValues("Values before swapping",arg1,arg2);
		int x = swapValues(arg1,arg2);
		arg2 = arg1;
		arg1 = x;
		displayValues("Values after swapping",arg1,arg2);
	}

	private static int swapValues(int arg1,int arg2) {
	
	// Write logic to swap values
		arg1 = arg1^arg2;
		arg2 = arg1^arg2;
		arg1 = arg1^arg2;
		return arg1;
	}
	
	private static void displayValues(String str,int arg1, int arg2) {
		System.out.println(str);
		System.out.println("arg1 = " + arg1);
		System.out.println("arg2 = " + arg2);
	}
}
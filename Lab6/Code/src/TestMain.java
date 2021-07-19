public class TestMain {
	public static void main(String[] args) {
		SwapData obj = new SwapData();

		int arg1 = 0;
		int arg2 = 0;

//Read values of arg1 and arg2 from Console
		Console c = new Console();
		System.out.println("Enter value1: ");
		arg1 = c.readInt();
		System.out.println("Enter value2: ");
		arg2 = c.readInt();
		obj.setValues(arg1, arg2);

// Call set methods of SwapData object

		obj.displayValues("Before Swapping...");

		obj.swapValues();

		obj.displayValues("After Swapping...");
	}
}

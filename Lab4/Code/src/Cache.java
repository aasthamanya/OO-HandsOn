public class Cache {
	private static int MAX_CAPACITY = 0;
	
	// Implement static block
	static int getMaxCapacity() {
		if(MAX_CAPACITY==0)
		{
			System.out.println("Enter MAX_CAPACITY: ");
			int val = Console.readInt();
			MAX_CAPACITY = val;
		}
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
		
	}
}
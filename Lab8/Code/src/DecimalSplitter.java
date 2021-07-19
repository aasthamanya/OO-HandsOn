public class DecimalSplitter {
	static boolean isOdd(int num) {
//Complete the logic
		if(num%2==0)
			return false;
		return true;
	}
	static int getWhole(double num) {
//Complete the logic
		String whole = Double.toString(num);
		int i=0;
		String res="";
		while(whole.charAt(i)!='.')
		{
			res+=whole.charAt(i);
			i++;
		}
		int x = Integer.valueOf(res);
		return x;
	}
	
	static double getFraction(double num) {
//Complete the logic
		String whole = Double.toString(num);
		int i=0;
		String res="";
		while(whole.charAt(i)!='.')
		{
			i++;
		}
		i++;
		while(i<(whole.length()))
		{
			res+= whole.charAt(i);
			i++;
		}
		double x = Double.valueOf(res);
		return x;
	}
}










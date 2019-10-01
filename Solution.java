import java.util.*;
public class Solution {

	static long superDigit(long x) {
		
		
		if (x==0)
			return 0;
		//x=x%10 +superDigit(superDigit(x/10));
		//System.out.println(x);
		
			//x=x%10 +superDigit(superDigit(x/10));
			x=x%10+superDigit(x/10);
		
		
		return (x);
	
		
		
		}
	public static void main (String[] args) {
		int number;
		long result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number= ");
		number =sc.nextInt();
		
		sc.close();
		
		result = superDigit(number);
		
		
		System.out.println("Super digit is: " + result);
		
	}
	
	
}

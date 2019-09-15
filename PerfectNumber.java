import java.util.Scanner;


public class PerfectNumber {
	
	enum STATE{
		Perfect,
		Deficient,
		Abundant;
	}

	
	public static STATE process(int n) {
		long sum=0;
		for(int i=1; i<n; i++) {
			if (n%i==0) {
				sum = sum+i;
			}
		}
		if (sum == n || n==1) return STATE.Perfect;
		else if (sum > n) return STATE.Abundant;
		else return STATE.Deficient;		
	}
	
	public static void main(String[] args) {
		int some;
		
		Scanner sc=new Scanner(System.in);
		some = sc.nextInt();
		if (process(some)==STATE.Perfect) System.out.println("Perfect");
		else if (process(some)==STATE.Deficient) System.out.println("Deficient");
		else System.out.println("Abundant");
		sc.close();
	}
	
}
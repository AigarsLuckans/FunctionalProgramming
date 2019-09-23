import java.util.Scanner;
import java.util.*;
import java.util.stream.IntStream;
public class PerfectNumber {
	
	enum STATE{
		Perfect,
		Deficient,
		Abundant;
	}

	
	public static STATE process(int n) {
		int sum= IntStream
				.range(1, n)
				.filter(k -> n % k == 0)
				.sum();
		
		return sum ==n ? STATE.Perfect : sum < n ? STATE.Deficient : STATE.Abundant;
	}
	
	public static Integer[] SqrtDivisors(int n){
		Integer[] div = IntStream
				.range(1, Math.toIntExact(Math.round(Math.sqrt(n))))
				.filter(k -> n % k == 0)
				.boxed()
				.toArray(Integer[]::new);
				
		
		return div;
		
	}
	
	
	
	public static void main(String[] args) {
		int some;
		
		Scanner sc=new Scanner(System.in);
		some = sc.nextInt();
		if (process(some)==STATE.Perfect) System.out.println("Perfect");
		else if (process(some)==STATE.Deficient) System.out.println("Deficient");
		else System.out.println("Abundant");
		
		System.out.println(Arrays.toString(SqrtDivisors(some)));
		sc.close();
	}
	
}

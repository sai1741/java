
import java.util.*;
public class avgOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers to get average :");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int avg = (num1+num2+num3)/3;
		
		System.out.println(avg);
		
	}

}

package basic;
import java.util.*;
public class areaOfSquare {

	public static void main(String[] args) {
		
		System.out.println("enter side of square :");
		
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		
		int area = side*side;
		System.out.print(area);
		
	}

}

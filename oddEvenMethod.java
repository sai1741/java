
//finding odd or even using method
import java.util.*;
public class oddEvenMethod {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        sc.close();
    }
}
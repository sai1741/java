import java.util.*;
public class positiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int num = sc.nextInt();
        String result = (num>=0)?"positive":"negative";

        System.out.println(result);
    }
}

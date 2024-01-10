
//average of three number
import java.util.Scanner;

public class avgNumber {

    public static double avg(double num1,double num2,double num3){
        return (num1+num2+num3)/3;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers to get their average :");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();
        System.out.println(avg(num1,num2,num3));
        sc.close();
    }
}
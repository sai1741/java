import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number :");
        int num = sc.nextInt();
        int rNum=0;
        while (num>0) {
          rNum*=10;
          rNum+=num%10;
          num/=10;
        }
        System.out.println(rNum);
    }
}

import java.util.Scanner;
public class printReverseNumber {
    public static void main(String args[]){
        System.out.println("Enter number : ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            System.out.print(num%10);
            num=num/10;
        }
    }
}

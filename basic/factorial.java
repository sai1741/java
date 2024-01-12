import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num= sc.nextInt();
        int fac=num;
        for(int i=1;i<num;i++){
                fac*=i;
        }
        System.out.println("factorial = "+fac);
    }
}

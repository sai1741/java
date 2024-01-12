import java.util.Scanner;

public class binCoeff {

        //calc factorial
    public static int fac(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

        //calc bionomial coefficient
    public static int bionomial(int n,int r){
        return fac(n)/(fac(r)*fac(n-r));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n and r :");
        int n = sc.nextInt();
        int r= sc.nextInt();
        System.out.print(bionomial(n, r));

    }
}
import java.util.Scanner;

public class checkPrimeOptimised {

    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enetr number :");
        int num=sc.nextInt();
        System.out.println(isPrime(num));
    }
}
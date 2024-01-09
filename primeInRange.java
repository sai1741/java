import java.util.Scanner;

public class primeInRange {

    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number : ");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
        }
    }
}
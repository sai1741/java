import java.util.*;
public class primeOrNot {
    public static void main(String args[]){
        System.out.println("enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for( i=2;i<num/2;i++){
            if(num%i==0){
                System.out.println("not prime");
                break;
            }
        }
        if (i==num/2||num==2||num==3) {
            System.out.println("prime");

        }

    }
}

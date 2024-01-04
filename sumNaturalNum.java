

import java.util.Scanner;



public class sumNaturalNum {
    public static void main(String args[]){
        System.out.println("enter natural number :");
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("sum = "+sum);
    }
}

import java.util.*;
public class sumOfEvenOdd {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int odd=0;
    int even=0;
    int num;
    System.out.println("enter '0' to get sum");
    do{
        System.out.println("enter number :");
        num=sc.nextInt();
        if (num%2==0) {
            even+=num;
        }
        else{
            odd+=num;
        }
        
    }while(num!=0);

    System.out.println("sum of odd number is : " +odd);   
    System.out.println("sum of even number is : " +even);

    }
  
}

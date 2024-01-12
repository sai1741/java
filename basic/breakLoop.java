
//keep entering number until user enters multiple of 10
import java.util.*;
public class breakLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers until you entered multiple of 10 :");
        int num;
        while(true){
            num=sc.nextInt();
            if(num%10==0){
                System.out.println("you entered number is multiple of 10 ");
                break;
            }
            
        }
    }
}

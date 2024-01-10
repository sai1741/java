
//number is pallindrome or not
import java.util.*;
public class pallindrome {

  public static boolean isPallindrome(int num){
    int reverse=0;
    int numOrigin=num;
      while (num>0) {
        reverse=reverse*10+num%10;
        num/=10;
      }
      return numOrigin==reverse;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(isPallindrome(num)){
        System.out.println("pallindrome");
    }
    else{
        System.out.println("not pallindrome");
    }
    sc.close();
}  
}

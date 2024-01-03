import java.util.Scanner;

public class effectiveLeapYear {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year :");
        int year = sc.nextInt();
         boolean x = (year % 4 == 0);
         boolean y = (year % 100 !=0);
         boolean z = (year % 400 == 0);

         if(x && ( z || y )){
            System.out.println("leap year");
        
         }else{
             System.out.println("not leap year");
         }
    }
}

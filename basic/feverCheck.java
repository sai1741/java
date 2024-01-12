import java.util.*;
public class feverCheck {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temp :");
        double temp = sc.nextDouble();
        if (temp>=100) {
            System.out.println("fever");
        }
        else{
            System.out.println("no fevver");
        }
    }
}

import java.util.*;

public class passOrFail {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of student :");
        int marks = sc.nextInt();
        String result = (marks>=33)?"pass":"fail";
        System.out.println(result);
    }
}

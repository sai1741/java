import java.util.*;

class largestOfThree_ConditionStatement{
    public static void main(String arge[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers [a,b,c] :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b) {
            if (a>c) {                                                //a>b and a>c
                System.out.println(" largest number is : "+ a);
            }
            else{                                                    //a>b but c>a -> c>a>b
                System.out.println(" largest number is : " +c);
            }
        }
        else if (b>c) {                                             //a<b and b>c -> b>a,c
                System.out.println(" largest number is : " +b);
        }
        else{                                                       //a<b and b<c -> c>a,b
                System.out.println(" largest number is : " +c);
        }
    }
}
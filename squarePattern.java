import java.util.Scanner;

public class squarePattern {
    public static void main (String args[]){
        System.out.println("enter number of stars on each side :");
        Scanner sc = new Scanner(System.in);
        int sNum = sc.nextInt();
        for(int i=0;i<sNum;i++){
            for(int j=0;j<sNum;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

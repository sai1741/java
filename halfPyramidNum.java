import java.util.Scanner;

public class halfPyramidNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of column :");
        int colNum = sc.nextInt();
        for(int line = 1; line <= colNum; line++){
            for(int num=1 ; num <=line; num++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

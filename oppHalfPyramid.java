import java.util.Scanner;

public class oppHalfPyramid {
    public static void main(String[] args) {
        System.out.println("enter number of column :");
        Scanner sc= new Scanner(System.in);
        int colNum = sc.nextInt();
        for(int row=1;row<=colNum;row++){
            for(int col=1;col<=colNum;col++){
                if (col<=colNum-row) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of column");
        int colNum=sc.nextInt();
        for(int row =1;row<=colNum;row++){
            for(int col=1;col<=colNum;col++){
                if (row==1||row==colNum||col==1||col==colNum) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

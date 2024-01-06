import java.util.Scanner;

public class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of column :");
        int colNum=sc.nextInt();
        char chtr='A';
        for(int row=1;row<=colNum;row++){
            for(int col=1;col<=row;col++){
                System.out.print(chtr+" ");
                chtr++;
            }
            System.out.println();
        }
    }
}

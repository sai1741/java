import java.util.Scanner;

public class invertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int colNum=sc.nextInt();
        for(int line=0;line<colNum;line++){
            for(int star=colNum-1-line;star>=0;star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

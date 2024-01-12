import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of column :");
        int colNum = sc.nextInt();
        for(int line=0;line<colNum;line++){
            for(int star=0;star<=line;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

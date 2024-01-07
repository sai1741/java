import java.util.*;
public class floydsTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int colNum=4;
        int num=1;
        for(int row=1;row<=colNum;row++){
            for(int col=1;col<=row;col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }


    }
}

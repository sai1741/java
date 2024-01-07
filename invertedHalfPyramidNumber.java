import java.util.*;
public class invertedHalfPyramidNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int colNum=4;
        
        for(int row=1;row<=colNum;row++){
            for(int col=1;col<=colNum-row+1;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }


    }
}

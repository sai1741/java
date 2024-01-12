import java.util.*;
public class zero1Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int colNum=4;
        int num=1;
        for(int row=1;row<=colNum;row++){
            for(int col=1;col<=row;col++){
                if((col+row)%2==0){
                     System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


    }
}

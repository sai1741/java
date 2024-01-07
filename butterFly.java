import java.util.*;
public class butterFly {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int colNum=8;
       
        for(int row=1;row<=colNum;row++){
            for(int col=1;col<=colNum;col++){
                if((col>=row+1&&col<=colNum-row&&col<=colNum/2)){
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

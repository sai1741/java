import java.util.*;


public class solid_rhombus {
        public static void main(String args[]){
            int colNum=4;

            for(int row=1;row<=colNum;row++){
                for(int col=1;col<=colNum-row+1;col++){
                    System.out.print("  ");
                }
                for(int col=1;col<=colNum;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    
}
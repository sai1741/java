
public class hollowRhombus {
        public static void main(String args[]){
            int colNum=4;

            for(int row=1;row<=colNum;row++){
                for(int col=1;col<=colNum-row+1;col++){
                    System.out.print("  ");
                }
                for(int col=1;col<=colNum;col++){
                    if(row==1||col==1||row==colNum||col==colNum){
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
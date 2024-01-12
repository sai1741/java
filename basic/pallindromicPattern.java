public class pallindromicPattern{
        public static void main(String args[]){
            int colNum=5;
            for(int row=1;row<=colNum;row++){
                int num=row;
                for(int col=1;col<=colNum-row+1;col++){
                    System.out.print("  ");
                }
                for(int col=1;col<=row;col++){
                    System.out.print((row-col+1)+" ");
                }
                for(int col=1;col<=row-1;col++){
                    System.out.print((col+1)+" ");
                }
                System.out.println();
            }
        }
}
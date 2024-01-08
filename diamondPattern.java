public class diamondPattern{
    public static void main(String args[]){
        int colNum=7;

        for(int row=1;row<=colNum/2+1;row++){
            for(int col=1;col<=colNum/2-row+1;col++){
               System.out.print("  ");
            }
            for(int col=1;col<=row*2-1;col++){
                System.out.print("* ");
            }
            
            System.out.println();
        }

        for(int row =1;row<=colNum/2;row++){
            for(int col=1;col<=row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=colNum-2*row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class numberPyramid {
    public static void main(String[] args) {
        int colNum=5;
             for(int row=1;row<=colNum;row++){
                for(int col=1;col<=colNum-row+1;col++){
                    System.out.print("  ");
                }
                for(int col=1;col<=row*2-1;col++){
                 System.out.print(row+" ");
                }
                System.out.println();
            }
    }
}

public class numberPyramid {
    public static void main(String[] args) {
        int rowNum=5;
             for(int row=1;row<=rowNum;row++){
                for(int col=1;col<=rowNum-row+1;col++){
                    System.out.print("  ");
                }
                for(int col=1;col<=row*2-1;col++){
                 System.out.print(row+" ");
                }
                System.out.println();
            }
    }
}

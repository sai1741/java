public class searchSortedMatrix {
    public static void main(String[] args) {
        int num[][]={{10,20,30,40},{11,21,31,41},{12,22,32,42},{13,23,33,43}};
        int key=33;

        //always start from top right corner or bottom left corner
        int row=0;
        int col=num[0].length-1;
        while (row<num.length&&col>=0) {
            if(num[row][col]==key){
                System.out.println("key present at row: "+row+"   col: "+col);
                break;
            }
            // if key is less than number , travel to left
            else if(num[row][col]>key){
                col--;
            }
            //if key is greater than number , travel to right
            else{
                row++;
            }
        }
    }
}

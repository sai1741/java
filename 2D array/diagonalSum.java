

//method 1
public class diagonalSum {
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;

        //for primary diagonal
        int row=0;
        int col=0;
        while (row<num.length) {
            sum+=num[row][col];
            col++;
            row++;
        }
        
        //for secondary diagonal
        row=0;
        col=num[0].length-1;
        while (row<num.length) {
            if(row==col){
                row++;
                col--;
            }
            sum+=num[row][col];
            row++;
            col--;
            
        }

        System.out.println(sum);
    }
}

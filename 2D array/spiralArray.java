public class spiralArray {
    public static void main(String[] args) {
      
        int num[][]={{1,2,3,4},
                    {5,6,7,8},
                      {9,10,11,12},
                        {13,14,15,16}  };

        int startCol=0;
        int endCol=num[0].length-1;
        int startRow=0;
        int endRow=num.length-1;

        while (startCol<=endCol&&startRow<=endRow) {
            
            // first row
            for(int i = startCol;i<=endCol;i++){
                System.out.print(num[startRow][i]+" ");
            }
            
            //end column
            for(int i = startRow+1;i<=endRow;i++){
               
                System.out.print(num[i][endCol]+" ");
            }

            //end row
            for(int i = endCol-1;i>=startCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(num[endRow][i]+" ");
            }

            //first column
            for(int i = endRow-1;i>=startRow+1;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(num[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }

    }
}

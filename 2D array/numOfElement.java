//Print the number of 7’s that are inthe 2d array

public class numOfElement {
    public static void main(String[] args) {
        int arry[][]={{4,7,8},{8,8,7}};
        int count=0;
        for(int i=0;i<arry.length;i++){
            for(int j=0;j<arry[0].length;j++){
                if(arry[i][j]==7){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

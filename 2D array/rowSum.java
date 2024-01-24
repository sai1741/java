//Print out the sum of the numbers inthe second row of the “nums” array.
public class rowSum {
    public static void main(String[] args) {
        int num[][]= { {1,4,9},{11,4,3},{2,2,3} };
        int row=2; //row index
        int sum=0;
        for(int i=0;i<num[0].length;i++){
            sum+=num[row][i];
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class largestNum {

    public static void main(String[] args) {
        int num[][]=new int[3][3];
        arrayInput(num);
        largest(num);
    }
    private static void arrayInput(int[][] num) {
        Scanner sc =new Scanner(System.in);
       for(int i=0;i<num.length;i++){
          for(int j=0;j<num[0].length;j++){
            num[i][j]=sc.nextInt();
         }
         System.out.println();
       }
       sc.close();
    }

    private static void largest(int[][] num) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                max=Math.max(max, num[i][j]);
            }
        }

        System.out.println("maximum number in array : "+max);

    }
}
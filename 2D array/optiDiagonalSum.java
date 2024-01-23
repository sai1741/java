public class optiDiagonalSum {
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i][i];

            if(i!=num.length-1-i){
                sum+=num[i][num.length-1-i];
            }
        }

        System.out.println(sum);

    }
}

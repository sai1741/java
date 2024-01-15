public class maxSubArray_kadaanAlgorithm {
    
    public static void main(String[] args) {
        int numArray[]={-2,-5,1,-5,4,8,2,6,-12};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numArray.length;i++){
            sum=sum+numArray[i];
            if(sum<0){
                sum=0;
            }
            if (sum>max) {
                max=sum;
            }
        }
        System.out.println(max);
    }
}

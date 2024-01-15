public class maxSubArray_prifixMethod {
    public static void main(String[] args) {
        int numArray[]={1,2,5,-6,7};

        int prefixArray[]=new int[numArray.length];

        prefixArray[0]=numArray[0];
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=1;i<numArray.length;i++){
            prefixArray[i]=prefixArray[i-1]+numArray[i];
        }

        for(int i=0;i<numArray.length;i++){

            for(int j=i;j<numArray.length;j++){

                sum= i==0? prefixArray[j]:prefixArray[j]-prefixArray[i-1];
                
                if (max<sum) {
                    max=sum;
                }
            }
            
        }

        System.out.println(sum);

    } 
}

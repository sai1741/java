/**
 * subArrayMax
 */
public class subArrayMax {

    public static void main(String[] args) {
        int numArray[]={1,5,-13,5,6,-1};
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numArray.length;i++){

            for(int j=i;j<numArray.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+numArray[k];
                }
               
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);

    }
}
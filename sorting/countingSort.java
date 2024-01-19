public class countingSort {
    public static void main(String[] args) {
        int num[]={1,5,2,6,2,4,2,3,1};
        int max=Integer.MIN_VALUE;
       
        //taking max num of array to define range of values
        for(int i=0;i<num.length;i++){
            max=Math.max(max, num[i]);
        }

        //calculating frequency
        int count[]=new int[max+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }

        //sorting array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }

        //printing array
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }

    }
}


/**
 * bubbleSort
 */
public class bubbleSort {

    public static void main(String[] args) {
        int num[]={1,5,3,6,4,2};

        for(int i=0;i<num.length;i++){

            for(int j=1;j<num.length-i;j++){

                if (num[j]<num[j-1]) {
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
            }
        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
}
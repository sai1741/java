/*
  selectionSort
 */
public class selectionSort {

    public static void main(String[] args) {
        int num[]={5,6,2,9,3,8,4,7,1};
        for(int i=0;i<num.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<num.length;j++){
                if(num[minPos]>num[j]){
                    minPos=j;
                }
            }
            int temp = num[i];
            num[i]=num[minPos];
            num[minPos]=temp;
        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
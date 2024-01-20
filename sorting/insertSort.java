//insertion sort for decending order
public class insertSort {
    public static void main(String[] args) {
        int num[]={3,6,2,1,8,7,4,5,3,1};
        for(int i=1;i<num.length;i++){
           int curr=num[i];
           int prev=i-1;
           while(prev>=0&&curr>num[prev]){
            num[prev+1]=num[prev];
            prev--;
           }
           num[prev+1]=curr;
        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
}

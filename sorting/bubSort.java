//bubble sort for decending order
public class bubSort {
    public static void main(String[] args) {
        int num[]={3,6,2,1,8,7,4,5,3,1};

        for(int i=0;i<num.length;i++){

            for(int j=0;j<num.length-i-1;j++){
                 
                if(num[j]<num[j+1]){
                    int temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                 }
            }
        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}

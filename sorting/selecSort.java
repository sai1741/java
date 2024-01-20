
//selection sort for dcending order
public class selecSort {
    public static void main(String[] args) {
        int num[]={3,6,2,1,8,7,4,5,3,1};
        
        for(int j=0;j<num.length;j++){
            int minPos=j;

          for(int i=j+1;i<num.length;i++){
            if(num[minPos]<num[i]){
                minPos=i;
            }
          }

          int temp=num[j];
            num[j]=num[minPos];
            num[minPos]=temp;

        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

        
    }
}

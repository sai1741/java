//counting sort for decending order
public class countSort {
    public static void main(String[] args) {
        int num[]={3,6,2,1,8,7,4,5,3,1};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            max=Math.max(max, num[i]);
        }
        int count[] = new int[max+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }

        int j=num.length-1;
        for(int i=0;i<count.length;i++){
            while(count[i]!=0){
                num[j]=i;
                j--;
                count[i]--;
            }
        }

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}

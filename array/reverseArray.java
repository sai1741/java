/**
 * reverseArray
 */
public class reverseArray {

    public static void main(String[] args) {
        
        int numArray[]={1,5,4,8,6,3,2,7};
        int len=numArray.length;
        for(int i=0;i<len/2;i++){
            int temp=numArray[i];
            numArray[i]=numArray[len-1-i];
            numArray[len-1-i]=temp;
            
        }
   
        for(int i=0;i<len;i++){
            System.out.print(numArray[i]+" ");
        }
        
    }
}
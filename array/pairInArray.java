/**
 * pairInArray
 */
public class pairInArray {

    public static void main(String[] args) {
        int numArray[]={1,2,3,4,5,9,6,8,7};
        
        for(int i =0;i<numArray.length;i++){
            for(int j = i+1;j<numArray.length;j++){
                System.out.print("("+numArray[i]+","+numArray[j]+")  ");
            }
            System.out.println();
        }

    }
}
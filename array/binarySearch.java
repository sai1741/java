/**
 * binarySearch
 */
public class binarySearch {

    public static void main(String[] args) {
        int numArray[]={12,23,26,35,39,45,47,57};
        int key = 57;
        int index=keyIndex(key,numArray);
        if (index==-1) {
            System.out.println("key is not present");
        }
        else{
            System.out.println("key index : "+index);
        }
    }

    private static int keyIndex(int key,int numArray[]) {
        int start=0;
        int end=numArray.length-1;

        while (start<=end) {
            int mid=(start+end)/2;
            if(numArray[mid]==key){
                return mid;
            }
            else if (numArray[mid]<key) {
                 start=mid+1;
            }
            else if(numArray[mid]>key){
                end=mid-1;
            }
        }
       return -1;
    }
}
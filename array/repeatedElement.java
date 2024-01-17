/*Given an integer array nums, return true if any value appears 
at least twice in the array, and return false if every element is distinct.*/


public class repeatedElement {
    public static void main(String[] args) {
        
        int num[]={1,2,3,4};
        boolean isRepeat=false;

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    isRepeat=true;
                    break;
                }
            }
        }

        System.out.print(isRepeat);

    }
}


/**
 * larNumArray
 */
public class larNumArray {

    public static void main(String[] args) {
        
        int numberArray[]= {15,45,56,82,93,45,100,52,63};

        System.out.println(largestNUmber(numberArray));
    }

    private static int largestNUmber(int[] numberArray) {
        int num=numberArray[0];                 // num stores first array element
        for(int i=1;i<numberArray.length;i++){  // loops starts from 2nd array element
           num=Math.max(num, numberArray[i]);   //num keep storing maximum element
        }
        return num;
    }
}

/*
  linearSearch
 */
public class linearSearch {

    public static void main(String[] args) {

        int numberArray[]={10,56,42,15,48,86,75,23,45};
        int key=42;

        int index=keyIndex(key,numberArray);


        if (index==-1) {
            System.out.println("key is not present");
        }
        else{
            System.out.println("key index : "+index);
        }


    }

    private static int keyIndex(int key, int[] numberArray) {

        for(int i=0;i<numberArray.length;i++){

            if (key==numberArray[i]) {
                return i;
            }
        }

       return -1;
    }
}
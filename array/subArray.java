public class subArray {
    public static void main(String[] args) {
        int numArray[]={2,5,1,3,6,4,8,9,7};

        for(int i=0;i<numArray.length;i++){
            for(int j=i;j<numArray.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numArray[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

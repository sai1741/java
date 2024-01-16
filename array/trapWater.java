
// find trapped rainwater
public class trapWater {

    public static void main(String[] args) {
        int array[]={4,2,0,6,3,2,5};
        int maxLeft[]=new int[array.length];
        int maxRight[]=new int[array.length];

        maxLeft[0]=array[0];
        for(int i=1;i<array.length;i++){                //finding maximum left boundry
            maxLeft[i]=Math.max(maxLeft[i-1],array[i]);
        }
        maxRight[array.length-1]=array[array.length-1];
        for(int i=array.length-2;i>=0;i--){             //finding maximum right boundry
            maxRight[i]=Math.max(array[i],maxRight[i+1]);
        }
        int rainWater=0;
        for(int i=0;i<array.length;i++){
            rainWater+=Math.min(maxLeft[i],maxRight[i])-array[i]; //rainwater trapped in each block is = minimum boundary - height of array
        }
        System.out.println(rainWater);
    }
}
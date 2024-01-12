/**
 * sumDigits
 */
public class sumDigits {

    public static void main(String[] args) {
        int num=1232;
        System .out.println("sum of digit "+sum(num));
    }

    private static int sum(int num) {
         int smDigit=0;
        while(num>0){
                smDigit=smDigit+num%10;
                num/=10;
        }

        return smDigit;
    }
}
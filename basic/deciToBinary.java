
//decimal to binary number conversion

import java.util.Scanner;

public class deciToBinary {
    public static int toBinary(int num){
        int bNum=0;
        for(int i=0;num>0;i++){
            int digit=num%2;
            bNum=bNum+digit*(int)Math.pow(10, i);
            num/=2;
        }
      return bNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(toBinary(num));
        sc.close();
    }
}
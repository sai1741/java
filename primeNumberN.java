import java.util.Scanner;

public class primeNumberN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nth number :");
        int num=sc.nextInt();
        
        System.out.println(2+"\n"+3);
        for(int i=4;i<=num;i++){
            boolean t=true;
            for(int j=2;j<=i/2;j++){
                if (i%j==0) {
                    t=false;
                    break;
                }
            }

            if (t) {
                System.out.println(i);
            }
        }
    }
}

import java.util.Scanner;

public class bioToDeci {

    public static int deci(int num){
        int deci=0;

        for(int i=0;num>0;i++){                               
            int lastDigi=num%10;
            deci=deci+(lastDigi*(int)Math.pow(2, i));  
            num/=10;
        }
        return deci;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(deci(num)+" ");
    }
}
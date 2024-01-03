import java.util.*;

class incomeTax{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

        System.out.println("enter your income :");

        int inc = sc.nextInt();
        
        if(inc<500000){
            System.out.println("tax :"+(inc*0/100));
        }
        else if(inc>500000 && inc<1500000){
            System.out.println("tax :"+ (inc*10/100));
        }
        else{
            System.out.println("tax :"+(inc*30/100));
        }


    }
}
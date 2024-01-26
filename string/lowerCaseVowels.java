import java.util.Scanner;

public class lowerCaseVowels {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter string :");
        String str = sc.nextLine();
        int count=0;

        for(int i =0;i<str.length();i++){

            if(str.charAt(i)>96&&str.charAt(i)<123){

                count++;

            }
        }

        System.out.println(count);
        sc.close();
    }
    
}


//change the first character of word to uppercase
import java.util.*;
public class firstUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String str=sc.nextLine();
        StringBuilder strb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        strb.append(ch);
        for(int i=1;i<str.length();i++){
            if(strb.charAt(i-1)==' '){
                char ch1 = Character.toUpperCase(str.charAt(i));
                strb.append(ch1);
            }
            else{
                strb.append(str.charAt(i));
            }
        }
        System.out.println(strb);
    }
}

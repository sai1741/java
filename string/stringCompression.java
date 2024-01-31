import java.util.*;
public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str= sc.nextLine();
    
        StringBuilder strb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            strb.append(str.charAt(i));
            if (count>1) {
                strb.append(count);
            }
        }
       
        System.out.println(strb);
    }
}

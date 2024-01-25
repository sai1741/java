

// string is Pallindrome or not
public class stringPallindrome {

    public static void main(String args[]){
        String str = "racecar";
        boolean isPallindrome=true;

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                isPallindrome=false;
                break;
            }
        }

        if(isPallindrome){
            System.out.println("String is pallindrome");
        }
        else{
            System.out.println("String is not pallindrome");
        }
    }
}
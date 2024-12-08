import java.util.*;
class palindrome{
    private String str;
    public void setData(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a string:");
            str=sc.nextLine();
        }
        finally{
            sc.close();
        }
    }
    public boolean checkPalindrome(){
        String revStr = "";
        for(int i=str.length()-1; i>=0; i--){
            char ext = str.charAt(i);
            revStr=revStr+ext;
        }
        if(str.equalsIgnoreCase(revStr))
            return true;
        else
            return false;
    }
}
class stringPalindrome{
    public static void main(String [] args){
        palindrome p = new palindrome();
        p.setData();
        boolean check=p.checkPalindrome();
        if(check)
            System.out.println("Palindrome!");
        else
            System.out.println("Not Palindrome!");
    }
}
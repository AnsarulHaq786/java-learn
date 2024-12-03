import java.util.*;
class vowel{
    private String str;
    public vowel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.nextLine();
    }
    public int vowelCounter(){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ext=Character.toLowerCase(str.charAt(i));
            if(ext=='a'|| ext=='e' || ext=='i' || ext=='o' || ext=='u')
                count++;
        }
        return count;
    }
}
class countVowel{
    public static void main(String [] args){
        vowel v=new vowel();
        int count=v.vowelCounter();
        System.out.println("Vowel count="+count);
    }
}

import java.util.*;
class cases{
    private String str;
    public void setData(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter any string:");
            str=sc.nextLine();
        }
        finally{
            sc.close();
        }
    }
    public String caseAlternator(){
        String newStr="";
        for(int i=0; i<str.length(); i++){
            char ext=str.charAt(i);
            if(i%2==0)
                newStr=newStr+Character.toUpperCase(ext);
            else
                newStr=newStr+Character.toLowerCase(ext);
        }
        return newStr;
    }
}
class alternateCases{
    public static void main(String [] args){
        cases c=new cases();
        c.setData();
        String res=c.caseAlternator();
        System.out.println(res);
    }
}
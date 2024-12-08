import java.util.*;
class number{
    private int number;
    public void setData(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter any number");
            number=sc.nextInt();
        }
        finally{
            sc.close();
        }
    }
    public int countOdd(){
        int count=0;
        int ext;
        while(number!=0){
            ext=number%10;
            if(ext%2!=0)
                count++;
            number=number/10;
        }
        return count;
    }
}
class countOddDigits {
    public static void main(String [] args){
        number n=new number();
        n.setData();
        int count=n.countOdd();
        System.out.println("Odd digits count="+count);
    }
}
// WAP to print all even numbers from 1 to 100 using all valid loop type
import java.util.*;
class evenNumber{
    public static void main(String [] args){
        number n=new number();
        n.evenFor();
        n.evenWhile();
        n.evenDoWhile();
    }
}
class number{
    public void evenFor(){
        for(int i=1; i<=100; i++){
            if(i%2==0)
                System.out.println(i+" ");
        }
    }
    public void evenWhile(){
        int i=1;
        while(i<=100){
            System.out.println(i+" ");
            i++;
        }
    }
    public void evenDoWhile(){
        int i=1;
        do{
            System.out.println(i+" ");
            i++;
        }while(i<=100);
    }
}
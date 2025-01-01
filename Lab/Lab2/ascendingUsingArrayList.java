import java.util.*;
class ascendingUsingArrayList{
    public static void main(String [] args){
        array arr=new array();
        arr.setDataAndSort();
    }
}
class array{
    private int digits;
    private ArrayList<Integer> a=new ArrayList<Integer>();
    public void setDataAndSort(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter no of digits:");
            digits=sc.nextInt();
            System.out.println("Enter numbers:");
            for(int i=0; i<digits; i++){
                a.add(sc.nextInt());
            }
            Collections.sort(a);
            for(int i:a){
                System.out.println(i);
            }
        }
        finally{
            sc.close();
        }
    }
}
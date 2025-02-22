import java.util.*;
public class customExceptionHandler{
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Double nomi=sc.nextDouble();
            Double deno=sc.nextDouble();
            try {
                if(deno==0){
                    throw new DivisionException("hey!, denominator is zero");
                }
                System.out.println("Division: "+(nomi/deno));
            } catch (DivisionException o) {
                System.out.println(o.getMessage());
            }
        }
    }
}
class DivisionException extends Exception{
    public DivisionException(String message){
        super(message);
    }
}
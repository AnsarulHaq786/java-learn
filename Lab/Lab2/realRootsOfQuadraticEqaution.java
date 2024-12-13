import java.util.*;

class realRootsOfQuadraticEquation{
    public static void main(String[] args) {
        quadraticEquation e=new quadraticEquation();
        e.setData();
        e.calcRoots();
    }
}
class quadraticEquation{
    private double a, b, c;
    public void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficient of x^2, x and constant:");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
    }
    public void calcRoots(){
        double r1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        double r2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        System.out.println("Roots are "+r1+" and "+r2);
    }
}
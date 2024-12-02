import java.util.*;
class triangle{
    private double a;
    private double b;
    private double c;
    private double area;
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle:");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
    }
    public double calculateArea(){
        double s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
class areaOfTriangle{
    public static void main(String [] args){
        triangle t=new triangle();
        t.setData();
        double area=t.calculateArea();
        System.out.println("Area of Triangle="+area);
    }
}
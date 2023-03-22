package test;

public class Circle {
    private double r;
    public static int count=0;
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r=r;
    }
    Circle(){
        r=1;
        count++;
    }
    Circle(double r){
        this.r=r;
        count++;
    }
    public double area(){
        return r * r * Math.PI;
    }
    public double girth(){
        return 2 * r * Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(Circle.count);
        Circle c1=new Circle();
        Circle c2=new Circle(5);
        Circle c3=new Circle();
        Circle c4=new Circle(10);
        System.out.println(Circle.count);
        System.out.println(c1.girth());
        System.out.println(c4.girth());
    }
}

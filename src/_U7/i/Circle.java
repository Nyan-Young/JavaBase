package _U7.i;

public class Circle implements Shape {
    double r;
    final double PI = 3.1415;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    @Override
    public double getGirth() {
        return 2 * PI * r;
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }
}

package _U7.i;


public class Rect implements Shape {
    double height;
    double width;
    public Rect(double height, double width){
        this.height = height;
        this.width = width;
    }
    public Rect(){}

    @Override
    public double getGirth() {
        return 2 * (height + width);
    }

    @Override
    public double getArea() {
        return height * width;
    }
}

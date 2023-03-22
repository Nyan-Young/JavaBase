package _U6;

public class TestShape {
    public static void main(String[] args) {
        Shape sp[] = new Shape[3];
        sp[0] = new Rect(35.5, 70);
        sp[1] = new Square(45.5);
        sp[2] = new Circle(2.65);
        System.out.println("矩形的周长=" +
                            sp[0].getGirth() + "，面积=" + sp[0].getArea());
        System.out.println("矩形的周长=" +
                            sp[1].getGirth() + "，面积=" + sp[1].getArea());
        System.out.println("矩形的周长=" +
                            sp[2].getGirth() + "，面积=" + sp[2].getArea());
    }
}

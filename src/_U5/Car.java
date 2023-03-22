package _U5;


public class Car {
    private int speed;
    protected String name;
//    Car(){}
    Car(int speed, String name){
        this.speed=speed;
        this.name=name;
    }
    Car(String _name, int _speed){
        speed=_speed;
        name=_name;
    }
    void show(){
        System.out.println("车的速度是: " + speed);
        System.out.println("车主的名字是: " + name);
    }
    static {
        System.out.println("Hello!");
    }
    {
        System.out.println("HAHAHA!");
    }

    public static void main(String[] args) {
//        Car a=new Car(); 自定义构造函数后，默认构造函数作废
        Car c=new Car(50, "张三");
        Car d=new Car("李四", 100);
        c.show();
        d.show();
        System.out.println(c.name+" "+c.speed);
    }
}

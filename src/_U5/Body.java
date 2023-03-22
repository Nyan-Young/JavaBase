package _U5;
public class Body {
    public long idNum;
    public String nameFor="unnamed";
    public Body orbit=null;
    public static long nextId=0;
    Body(){
        idNum=nextId++;
    }
    Body(String bodyName){
        this();
        nameFor=bodyName;
    }
    Body(String bodyName, Body orbitAround){
        this(bodyName);// 调用空参构造函数
        nameFor=bodyName;
        orbit=orbitAround;
    }
    public static void main(String[] args) {
        Body sun=new Body("Sun", null);
        Body earth=new Body("Earth", sun);
        Body xxx=new Body();
//        Car a = new Car();
//        Car e = new Car();
//        Car f = new Car();
        System.out.println(earth.orbit.nameFor);
        System.out.println(Body.nextId);
    }
}

package _U8;

import java.io.FileWriter;

interface FlyBehavior  {public void fly();};
class SubSonicFly implements FlyBehavior{
    public void fly(){
        System.out.println("亚音速飞行!");
    }
}

class SuperSonicFly implements FlyBehavior{
    public void fly(){
        System.out.println("超音速飞行!");
    }
}

interface TakeOffBehavior  {
    public void takeOff ();
}
class VerticalTakeOff implements TakeOffBehavior  {         public void takeOff (){
    System.out.println("垂直起飞!");
}
}
class LongDistanceTakeOff implements
        TakeOffBehavior  {
    public void takeOff (){
        System.out.println("长距离起飞!");
    }
}

abstract class AirCraft{
    protected FlyBehavior flyBehavior; //飞行
    protected TakeOffBehavior takeOffBehavior; //起飞
    public void fly(){
        flyBehavior.fly();
    }
    public void takeoff(){
        takeOffBehavior.takeOff();
    }
}

class Helicopter extends AirCraft{
    public Helicopter(){
        flyBehavior=new SubSonicFly();
        takeOffBehavior=new VerticalTakeOff();
    }
}

class Flighter extends AirCraft{
    public Flighter(){
        flyBehavior=new SubSonicFly();
        takeOffBehavior=new VerticalTakeOff();
    }
}

public class Java2022{
    public static void main(String[] args) {
        Helicopter h = new Helicopter();
        h.fly();
        h.takeoff();
        Flighter f = new Flighter();
        f.fly();
        f.takeoff();
    }
}
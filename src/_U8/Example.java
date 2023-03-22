package _U8;

interface ShowMessage{
    void showLogo(String s);
    default void outputStart(){
        System.out.println("*****");
    }
}

class TV implements ShowMessage{

    @Override
    public void showLogo(String s) {
        System.out.println("TVTV");
        System.out.println(s);
    }
    public void outputStart(){
        System.out.println("*****");
        System.out.println("*****");
    }
}

class PC implements ShowMessage{

    @Override
    public void showLogo(String s) {
        System.out.println("PCPC");
        System.out.println(s);
    }
}
public class Example {
    public static void main(String[] args) {
        ShowMessage sm;
        sm = new TV();
        sm.showLogo("长城牌电视机");
//        sm.outputStart();
        sm = new PC();
        sm.showLogo("华为个人电脑");
//        sm.outputStart();
//        sm = (s) -> {
//            System.out.println("CarCar");
//            System.out.println(s);
//        };
//        sm.showLogo("大众宝来");
//        sm.outputStart();
    }
}

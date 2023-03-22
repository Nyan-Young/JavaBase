package _U8;

public class Outer {
    private int varOuter = 100;
    class Inner{
        int varInner = 200;
        public void showOuter(){
            System.out.println(varOuter);
        }
    }
    public void showInner(){
        Inner i = new Inner();
        System.out.println(i.varInner);
        i.showOuter();
    }

    public static void main(String[] args) {
        Outer ii = new Outer();
        ii.showInner();
        System.out.println("-------------");
        Outer.Inner oi = ii.new Inner();
        oi.showOuter();
    }
}

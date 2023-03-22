package _U10;
interface Constants {
    public static final int Constants_A=1;
    public static final int Constants_B=12;
}
public class ConstantTest {
    enum Constants2 {
        Constants_A, Constants_B
    }
    public static void doit(int c){
        switch (c){
            case Constants.Constants_A:
                System.out.println("doit()_Constants_A");
                break;
            case Constants.Constants_B:
                System.out.println("doit()_Constants_B");
                break;
        }
    }
    public static void doit2(Constants2 c){
        switch (c){
            case Constants_A:
                System.out.println("doit()_Constants_A");
                break;
            case Constants_B:
                System.out.println("doit()_Constants_B");
                break;
        }
    }

    public static void main(String[] args) {
        ConstantTest.doit(Constants.Constants_A);
        ConstantTest.doit2(Constants2.Constants_A);
        ConstantTest.doit2(Constants2.Constants_A);
        ConstantTest.doit(1);
    }
}

package _U12;

public class run_test implements Runnable {
    String s;
    int millis;
    int count;

    public run_test(String s, int millis, int count) {
        this.s = s;
        this.millis = millis;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s + "has outputed");
        }
    }

    public static void main(String[] args) {
        Runnable ra=new run_test("a", 0, 17);
        Runnable rb=new run_test("b", 0, 20);
        Thread ta=new Thread(ra);
        Thread tb=new Thread(rb);
        ta.start();
        tb.start();
        for (int i = 0; i < 150; i++) {
            System.out.println("c");
        }
    }
}

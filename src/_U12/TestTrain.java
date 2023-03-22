package _U12;

public class TestTrain {
    public static void main(String[] args) {
        TrainRunnable r=new TrainRunnable();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);

        t1.start();
        t2.start();
        t3.start();
    }
}

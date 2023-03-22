package _U12;

public class YouHeThread extends Thread {
    String s;
    int millis;
    YouHeThread(String ss, int mm){
        s=ss;
        millis=mm;
    }
    public void run(){
        try {
            while (true){
                System.out.println(s);
                System.out.flush();
                sleep(millis);
            }
        } catch (InterruptedException e) {
            return;
        }
    }
    public static void main(String[] args) {
        YouHeThread t1=new YouHeThread("你", 25);
        Thread t2=new YouHeThread("他", 75);
        t1.start();
        t2.start();
    }
}

package _U12;

public class Tickets {
    private int num=50;

//    public synchronized int getNum() {
    public int getNum() {
        synchronized (this){
            return num;
        }
    }

    public synchronized void saleTicket(){
        if(num>0){
            System.out.println(Thread.currentThread()+": NO."+num+" ticket is sold");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
        }
    }
}

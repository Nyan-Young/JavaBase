package _U12;

public class TrainRunnable implements Runnable {
    Tickets ticket=new Tickets();
    @Override
    public void run() {
        while (true){
            if(ticket.getNum()>0){
                ticket.saleTicket();
            }else{
                System.out.println(Thread.currentThread()+": There is no tickets.");
                break;
            }
        }
    }
}

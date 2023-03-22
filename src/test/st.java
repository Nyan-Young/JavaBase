package test;

public class st implements Runnable {
    public String show;
    public int time;
    Thread thread=new Thread(this);

    public st(String name, String show, int time) {
        thread.setName(name);
        this.show=show;
        this.time=time;
    }

    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(show);
            try{
                Thread.sleep(time);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        st s=new st("s","您好",25);
        st t=new st("t","他好",15);
        s.thread.start();
        t.thread.start();
    }
}

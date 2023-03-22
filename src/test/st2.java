package test;

public class st2 extends Thread {
    public String show;
    public int time;

    public st2(String name, String show, int time) {
        this.setName(name);
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
        st2 s=new st2("s","您好",25);
        st2 t=new st2("t","他好",15);
        s.start();
        t.start();
    }
}

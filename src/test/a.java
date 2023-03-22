package test;

public class a extends Thread {
    public int x;
    a(int x){
        this.x=x;
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("a");
            try{
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        a x=new a(10);
        x.start();
    }
}

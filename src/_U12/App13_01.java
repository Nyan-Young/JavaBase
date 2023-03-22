package _U12;

class Ctest extends Thread{
    private String id;
    Ctest(String str){id=str;}
    public void run(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 100000000; j++);
            System.out.println(id+" is running...");
        }
    }
}
public class App13_01 {
    public static void main(String[] args) {
        Ctest dog=new Ctest("doggy");
        Ctest cat=new Ctest("kitty");
        dog.start();
        try {
            dog.join();//限制必须所有dog线程结束才能往下运行
        }catch (InterruptedException e){}
        cat.start();
        System.out.println("end programme");
//        dog.run();
//        cat.run();
    }
}

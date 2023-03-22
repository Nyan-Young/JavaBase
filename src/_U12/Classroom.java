package _U12;

public class Classroom implements Runnable {
    Thread student, teacher;

    Classroom() {
        student=new Thread(this);
        teacher=new Thread(this);
        student.setName("学生");
        teacher.setName("老师");
    }

    @Override
    public void run() {
        if(Thread.currentThread()==student){
            try {
                System.out.println(student.getName()+"正在睡觉，不听课");
                Thread.sleep(1000*60*60);
            } catch (InterruptedException e) {
                System.out.println(student.getName()+"被老师叫醒啦");
            }
        }else if(Thread.currentThread()==teacher){
            for (int i = 0; i < 3; i++) {
                System.out.println("上课！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            student.interrupt();
        }
    }
}

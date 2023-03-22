package _U6;

class Parent{
    Parent(){
        super();
        System.out.println("调用父类的Parent()构造方法");
    }
}

class SubParent extends Parent{
    SubParent(){
//        super();
        System.out.println("调用子类的SubParent()构造方法");
    }
}

public class SubRoutine extends SubParent {
    SubRoutine(){
//        super();
        System.out.println("调用子类的SubRoutine()构造方法");
    }

    public static void main(String[] args) {
        new SubRoutine();
    }
}

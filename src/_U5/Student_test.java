package _U5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Student {
    // 成员变量 属性
    String name;
    int birth;
    int i;
    // 重载
    // 构造方法
    Student(){}
    Student(String name, int _birth){
        this.name=name;
        birth=_birth;
    }
    Student(int _birth, String _name){
        name=_name;
        birth=_birth;
    }
    // 成员函数
    public void show(){
        System.out.println(i);
        System.out.println(name);
        System.out.println(birth);
    }

}
public class Student_test{
    public static void main(String[] args) {
        Student d1=new Student("张三",19910215);
        Student d2=new Student("李四",19880808);
        System.out.println("对象d1的属性和方法");
        System.out.println("name=" + d1.name);
        System.out.println("birth=" + d1.birth);
        d1.show();
        d1.name="张三丰";
        System.out.println("对象d2的属性和方法");
        System.out.println("name=" + d2.name);
        System.out.println("birth=" + d2.birth);
        d2.show();
        Student d3=new Student();
    }

}

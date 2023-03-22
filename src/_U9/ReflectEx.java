package _U9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectEx {
    private static final String[] Constructor=null;
    public static void main(String[] args) {
        Rect rect=new Rect();
        Class cs=rect.getClass();
        System.out.println(cs==Rect.class);
        Constructor[] con=cs.getDeclaredConstructors();
        Field[] field=cs.getDeclaredFields();
        Method[] method=cs.getDeclaredMethods();
        System.out.println("类的名字"+cs.getName());
        System.out.println("类中有如下的构造方法：");
        for (int i = 0; i < con.length; i++) {
            System.out.println(con[i].toString());
        }
        System.out.println("类中有如下的成员变量：");
        for (int i = 0; i < field.length; i++) {
            System.out.println(field[i].toString());
        }
        System.out.println("类中有如下的成员方法：");
        for (int i = 0; i < method.length; i++) {
            System.out.println(method[i].toString());
        }

    }
}

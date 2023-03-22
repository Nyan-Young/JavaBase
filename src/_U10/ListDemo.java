package _U10;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List li=new ArrayList();
        li.add("one");
        li.add("two");
        li.add(new Integer(3));
        li.add(new Float(4));
        li.add("two");
        li.add(new Integer(3));
        li.add(1, "dsdsdsd");
        li.remove(1);
        if(li.contains("two")) System.out.println("you two!");
        System.out.println(li);
        System.out.println("-----------------------------");
        for (int i = 0; i < li.size(); i++) {
            System.out.println(": "+li.get(i));
        }
    }
}

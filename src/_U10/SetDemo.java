package _U10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;


public class SetDemo {
    public static void main(String[] args){
        /*
         * HashSet
         * 元素是无序的，不允许重复的
         * 按照HashCode()来存储
         */
        HashSet s=new HashSet();
        s.add("one");
        s.add("two");
        s.add(new Integer(3));
        s.add(new Float(4));
        s.add("two");
        s.add(new Integer(3));
        System.out.println(s);
        System.out.println("---------------");
        Iterator it=s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("s的元素个数是"+s.size());

        /*
         * TreeSet
         * 元素不允许重复
         * 存入的顺序跟存储的顺序不同，但是存储是按照排序存储的,且要求各元素间的类型是可比较的
         */
        TreeSet tree=new TreeSet();
        tree.add("one");
        tree.add("two");
        tree.add(new Integer(3).toString());
        tree.add(new Float(4).toString());
        tree.add("two");
        tree.add(new Integer(3).toString());
        System.out.println(tree);
        System.out.println("tree的元素个数是"+tree.size());
    }
}

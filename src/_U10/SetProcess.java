package _U10;

import java.util.HashSet;
import java.util.Iterator;

public class SetProcess {
    public static void main(String[] args) {
        HashSet<Integer> A=new HashSet<Integer>();
        HashSet<Integer> B=new HashSet<Integer>();
        for (int i = 0; i < 4; i++) {
            A.add(i);
        }
        B.add(1);
        B.add(2);
        B.add(5);
        B.add(6);
        HashSet<Integer> temp=(HashSet<Integer>)A.clone();
        A.removeAll(B);
        B.removeAll(temp);
        B.addAll(A);
        System.out.println("A和B的对称差集合有"+B.size()+"个元素");
        Iterator iter=B.iterator();
        while (iter.hasNext()){
            System.out.printf("%d", iter.next());
        }
    }
}

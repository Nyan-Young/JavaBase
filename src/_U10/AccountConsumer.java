package _U10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class AccountConsumer {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> ac=new HashMap<String, HashSet<String>>();
        HashSet<String> cus1=new HashSet<String>();
        cus1.add("SY000005");
        cus1.add("SY000015");
        ac.put("SY0000000111",cus1);
        HashSet<String> cus2=new HashSet<String>();
        cus1.add("DL000005");
        cus1.add("DL000015");
        ac.put("DL0000000111",cus2);
        HashSet<String> cus3=new HashSet<String>();
        cus1.add("SH000005");
        cus1.add("SH000015");
        ac.put("SH0000000111",cus3);
        Iterator<String> it=ac.keySet().iterator();
        while (it.hasNext()){
            String customer=it.next();
            HashSet<String> accout=ac.get(customer);
            Object[] acc=accout.toArray();
            System.out.print("身份号码是"+customer+"的用户的账户为");
            for (int i = 0; i < acc.length; i++) {
                System.out.print(acc[i]+" ");
            }
            System.out.println();
        }


    }
}

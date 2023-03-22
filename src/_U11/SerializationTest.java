package _U11;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException,IOException{
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try{
            Customer c1=new Customer("Dingdang",10,"kangfu",200.0);
            Customer c2=new Customer("Kenan",7,"xianan",2000.0);
            fos=new FileOutputStream("D:/customer.txt");
            oos=new ObjectOutputStream(fos);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("对象序列化...");
            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.flush();
        }finally {
            oos.close();
            fos.close();
        }
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try{
            fis=new FileInputStream("D:/customer.txt");
            ois=new ObjectInputStream(fis);
            System.out.println("对象反序列化...");
            Customer c1=(Customer) ois.readObject();
            System.out.println(c1);
            Customer c2=(Customer) ois.readObject();
            System.out.println(c2);
        }finally {
            ois.close();
            fis.close();
        }
    }
}
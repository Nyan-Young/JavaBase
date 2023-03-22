package _U11;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("D:/f2.txt");
            fo.write(65);
            fo.write(new byte[] {'1','2','3'});
            byte b[]= {'\r','\n','o','k'};
            fo.write(b);
            fo.flush();
            System.out.println("写入成功");
        } finally {
            // TODO: handle finally clause
            fo.close();
        }
    }

}

package _U11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        File file=new File("D:/f2.txt");
        FileInputStream fs = null;
        try{
            if (file.exists() == false) {
                System.out.println("文件不存在！");
                return;
            }
            fs = new FileInputStream(file);
            int c=0;
            while ((c=fs.read())!=-1){
                System.out.print((char) c);
            }
            System.out.print('\n');
        }finally {
            if(fs!=null){
                fs.close();
            }
        }
    }

}

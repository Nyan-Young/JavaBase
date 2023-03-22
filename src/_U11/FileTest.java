package _U11;


import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file=new File("file1.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件删除成功！");
        }else {
            try {file.createNewFile();} catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("文件名是：" + file.getName());
            System.out.println("文件的路径是：" + file.getPath());
            System.out.println("文件名是：" + file.getName());
            System.out.println("文件名是：" + file.getName());
        }
    }
}

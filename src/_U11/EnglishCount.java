package _U11;

import java.io.*;

public class EnglishCount {
    public static void main(String[] args) {
        File fRead=new File("englishCount.txt");
        try {
            Reader in=new FileReader(fRead);
            BufferedReader bufferedReader=new BufferedReader(in);
            String str=null;
            while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);
            }
            bufferedReader.close();
            in.close();
        }catch (IOException e){
            e.getMessage();
        }
    }
}

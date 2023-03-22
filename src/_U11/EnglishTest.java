package _U11;

import java.io.*;

public class EnglishTest {
    public static void main(String[] args) {
        File fRead=new File("english.txt");
        File fWrite=new File("englishCount.txt");
        try {
            Writer out=new FileWriter(fWrite);
            BufferedWriter bufferedWriter=new BufferedWriter(out);
            Reader in=new FileReader(fRead);
            BufferedReader bufferedReader=new BufferedReader(in);
            String str=null;
            while ((str=bufferedReader.readLine())!=null){
                String result[]=str.split("\\s+");
                int count=result.length;
                str=str+"句子中的单词个数："+count;
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            out.close();
            bufferedReader.close();
            in.close();
            System.out.println("英语单词统计完毕！统计结果放在englishCount.txt\n");
        }catch (IOException e){
            e.getMessage();
        }

    }
}

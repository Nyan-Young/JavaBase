package _U11;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Homework0 {
    public static void main(String[] args){
        File file=new File("sample.txt");
//        File file=new File("sample2022.txt");
        Map<String, Integer> map=new HashMap<>();
        try {
            Reader in=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(in);
            String str=null;
            while ((str=bufferedReader.readLine())!=null){
                String[] temp=str.split("\\.");
                int len=temp.length;
                if(len>1){
                    String t0=temp[len-1];
                    if(!map.containsKey(t0)){
                        map.put(t0, 1);
                    } else{
                        map.put(t0,map.get(t0)+1);
                    }
                }
            }
            bufferedReader.close();
            in.close();
        }catch (IOException e){
            e.getMessage();
        }finally {
            for (String key : map.keySet()) {
                System.out.println("文件类型：" + key + "，数量：" + map.get(key));
            }
        }
    }
}


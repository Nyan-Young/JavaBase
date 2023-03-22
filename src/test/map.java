package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class map {
    private String path="Vertex.txt";
    public void createMap(){
        Scanner scanner=new Scanner(System.in);
        List<String> points=new ArrayList<String>();
        while (!scanner.hasNext("0")){
            points.add(scanner.next());
        }
        File file=null;
        Writer writer=null;
        BufferedWriter bw=null;
        try{
            file=new File(path);
            writer=new FileWriter(file);
            bw=new BufferedWriter(writer);
            for (int i = 0; i < points.size(); i++) {
                bw.write(points.get(i));
                bw.newLine();
            }
            bw.flush();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
            try {
                if (bw != null) bw.close();
                if (writer != null) writer.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void showMap(){
        File file=null;
        Reader reader=null;
        BufferedReader br=null;
        try {
            file=new File(path);
            reader=new FileReader(file);
            br=new BufferedReader(reader);
            String s=null;
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if(br!=null)br.close();
                if(reader!=null)reader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public boolean deletePoint(String point){
        List<String> points=new ArrayList<String>();
        File file=null;
        Writer writer=null;
        BufferedWriter bw=null;
        Reader reader=null;
        BufferedReader br=null;
        try{
            file=new File(path);
            reader=new FileReader(file);
            br=new BufferedReader(reader);
            String s=null;
            while ((s=br.readLine())!=null){
                points.add(s);
            }
            if(!points.contains(point)){
                return false;
            }
            points.remove(point);
            writer=new FileWriter(file);
            bw=new BufferedWriter(writer);
            for (int i = 0; i < points.size(); i++) {
                bw.write(points.get(i));
                bw.newLine();
            }
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally {
            try {
                if (bw != null) bw.close();
                if (writer != null) writer.close();
                if(br!=null)br.close();
                if(reader!=null)reader.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        map m=new map();
        m.createMap();
        m.showMap();
        m.deletePoint("b");
        m.showMap();
    }
}

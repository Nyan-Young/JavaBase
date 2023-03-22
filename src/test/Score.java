package test;

import java.util.*;
public class Score {
    public int avg;
    public HashMap<String,Integer> students;
    public Object[] up;

    public Score(HashMap<String, Integer> students) {
        avg = 0;
        this.students = students;
        List<Integer> a=new ArrayList<Integer>(students.values());
        for (int i = 0; i < a.size(); i++) {
            avg+=a.get(i);
        }
        avg/=a.size();
    }
    public Set<String> upper(){
        Iterator<String> it=students.keySet().iterator();
        HashMap<String,Integer> temp=new HashMap<String,Integer>();
        while(it.hasNext()){
            String c=it.next();
            if(students.get(c)>avg){
                temp.put(c,students.get(c));
            }
        }
        up=temp.values().toArray();
        return temp.keySet();
    }

    public static void main(String[] args) {
        HashMap<String,Integer> a=new HashMap<String,Integer>();
        a.put("1",80);
        a.put("2",90);
        a.put("3",90);
        a.put("4",90);
        Score score=new Score(a);
        Set<String> x=score.upper();
        System.out.println(x);
        for (int i = 0; i < score.up.length; i++) {
            System.out.println(score.up[i]);
        }
    }
}

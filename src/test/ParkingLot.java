package test;


import java.util.HashMap;
import java.util.Scanner;

public class ParkingLot {
    static HashMap<String, Integer> map;
    public static void charge(String type, int time){
        System.out.println("应收"+map.get(type)*time+"元");
    }
    public static void main(String[] args) {
        map=new HashMap<String, Integer>();
        map.put("客车", 15);
        map.put("货车", 12);
        map.put("轿车", 3);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入车型及时长（小时）以计算应收费用");
        while (!scanner.hasNext("退出收费系统")){
            String t1=scanner.next();
            int t2=scanner.nextInt();
            charge(t1, t2);
        }
    }
}

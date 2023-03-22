package _U9;

import java.util.Scanner;

public class AssertEx {
    public static void main(String[] args){
        int[] a=new int[3];
        int sum=0;
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt();
            assert a[i]>=0;
            sum+=a[i];
        }
        r.close();
        System.out.println("sum="+sum);
    }
}

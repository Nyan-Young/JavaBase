package test;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  N;
        N = input.nextInt();
        String binstr = Integer.toBinaryString(N);
        System.out.println(binstr);
        char [] stringArr = binstr.toCharArray();
        int[] a = new int[stringArr.length];
        for(int length=stringArr.length;length>0;length--){
            if((length-1)%2==1){
                a[length-1]=0;
            }
            else a[length-1]=stringArr[length-1]-'0';
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<a.length;i++) {
            sb.append(a[i]);
        }
        String v=sb.toString(); 
        int n = Integer.valueOf(v,2);
        System.out.println(n);

        input.close();
    }

}
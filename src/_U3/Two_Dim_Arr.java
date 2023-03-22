package _U3;

import java.util.Scanner;

public class Two_Dim_Arr {
    public static void main(String[] args) {
        final int N=3,M=3;
        int a[][]=new int[N][M];
        Scanner reader=new Scanner(System.in);
        System.out.println("Input "+N+"*"+M+" number ,Please:");
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                a[i][j]=reader.nextInt();
        System.out.println("数组中元素是");
        int max,row,col;
        max=a[0][0];
        row=col=1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.printf("%5d",a[i][j]);
                if(a[i][j]>max){max=a[i][j];row=i+1;col=j+1;}
            }
            System.out.println();
        }
        zhuanZhi(a);
        System.out.println("row="+row+"  col="+col+"  max="+max);
    }
    private static void zhuanZhi(int[][] a){
        System.out.println("---转置后得矩阵为---");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.printf("%5d",a[j][i]);
            }
            System.out.println();
        }
    }

}

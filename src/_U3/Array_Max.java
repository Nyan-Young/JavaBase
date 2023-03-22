package _U3;

import java.util.Scanner;

public class Array_Max {
    static int xx[];
    public static void main(String[] args) {
        final int N = 10;
        int score[] = new int[N];
        int score0[] = new int[N];
        int max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + N + " number, please");
        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }
        for (int i = N - 1; i >= 0; i--) {
            score0[N - i - 1] = score[i];
            System.out.print(score[i]+ " ");
        }
        xx= new int[]{1, 2, 3, 4, 5};
        System.out.println(xx[0]);
//        for (int i = 0; i < N; i++) {
//            System.out.println(score0[i]);
//        }
//        max = score[0];
//        for (int i = 1; i < N; i++) {
//            if (score[i] > max) {
//                max = score[i];
//            }
//        }
//        System.out.println("max = " + max);
    }
}

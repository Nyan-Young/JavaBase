package _U4;

public class PerformanceTest {
    public static void main(String[] args) {
        String str = new String();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str = str + i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        StringBuffer str1 = new StringBuffer();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str1.append(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
        StringBuilder str2 = new StringBuilder();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str2.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
    }

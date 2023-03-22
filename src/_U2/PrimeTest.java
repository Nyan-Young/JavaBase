package _U2;

public class PrimeTest {
    public static void main(String[] args) {
        // 求10~100之间的所有素数
        int count = 0;
        for (int i = 10; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.print(i+"\t");
                if(count%5 == 0){
                    System.out.println();
                }
            }
        }
    }//main
}


package _U3;

public class ArrRand {
    public static int GetEvenNum(int num1, int num2){
        // random: [0, 1)
        int s = (int)num1 + (int)(Math.random() * (num2 - num1));
        if (s % 2 == 0){
            return s;
        } else {
            return s + 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("任意一个2~32之间的偶数" + GetEvenNum(2, 32));
    }
}

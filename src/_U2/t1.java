package _U2;
import java.util.Scanner;
public class t1 {
    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        System.out.println(n % 3 == 0);
        reader.close();
    }
}

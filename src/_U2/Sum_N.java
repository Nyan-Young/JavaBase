package _U2;
import java.util.Scanner;
public class Sum_N {
    public static void main(String[] args) {
        int n;
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if(n < 1){
            System.out.println("false");
        }else{
            for (int i = 1; i <= n; i++) {
                sum += 1/(i*1.0);
            }
            sum = Math.round(sum*100)/100.00;
            System.out.println(sum);
        }
    }
}

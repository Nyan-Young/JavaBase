package _U2;

public class WaterFlower {
    static int sxh(int n){
        int a, b, c;
        a = n%10;
        b = ((n-a)/10)%10;
        c = (n-b)/100;
        if(n == a*a*a + b*b*b + c*c*c){
            return 1;
        }else{
            return 0;
        }
    }
    static void printsxh(){
        for (int i = 100; i < 1000; i++) {
            if(sxh(i) == 1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printsxh();
    }

}

package test;

public class t0 {
//    public int xyz(int n) {
//        int res = n;
//        for (int i = n - 1; i > 1; i --){
//            res *= i;
//        }
//        return res;
//    }
    public int xyz(int n) {
        if (n > 1){
            return n * xyz(n-1);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {

    }
}

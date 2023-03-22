package _U9;

import java.util.Scanner;

class MyException extends Exception {
    String message;
    public MyException(String ErrorMessgae){
        message=ErrorMessgae;
    }
    public String getMessage(){
        return message;
    }
}
public class ExceptionDemo{
    public static int quotient(int x, int y) throws MyException{
        if(y<0){
            throw new MyException("除数不能是负数");
        } else if(y==0){
            throw new MyException("除数不能是0");
        }
        return x/y;
    }

    public static void main(String[] args) {
        int m,n;
        System.out.println("Input two numbers for m, n: ");
        Scanner r=new Scanner(System.in);
        m=r.nextInt();
        n=r.nextInt();
        try {
            int result=quotient(m,n);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("程序发生了其他异常");
        } finally {
            r.close();
        }
    }
}
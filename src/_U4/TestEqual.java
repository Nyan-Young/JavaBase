package _U4;

public class TestEqual {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("ABC");
        String s3 = new String("abc");
        boolean b = s1.equals(s2); // false
        boolean b2 = s1.equalsIgnoreCase(s2); // true
        System.out.println(s1 + "equals " + s2 + " :" + b);
        System.out.println(s1 + "equalsIgnoreCase " + s2 + " :" + b2);
        b = (s1 == s3); // false
        System.out.println("s1 == s3 " + b);
        String s4 = "abc";
        String s5 = "abc";
        String s6 = "abcd";
        b = (s4 == s5); // true
        System.out.println("s4 == s5 " + b);
        b = (s5 == s6); // false
        System.out.println("s5 == s6 " + b);
    }
}

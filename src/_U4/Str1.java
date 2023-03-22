package _U4;

public class Str1 {
    public static void main(String[] args) {
        String s = "   This is a book!   ";
        String s_trim = s.trim();
        char c = s.charAt(0);
        int i = s.length();
        String sub_s = s.substring(8);
        System.out.println(s);
        System.out.println(sub_s);
        System.out.println(c);
        String s1 = s.toUpperCase();
        String s2;
        s2 = s.replace("!", ".");
        StringBuffer ss = new StringBuffer("drink Java!");
        ss.insert(6, "Hot ");
        ss.setCharAt(0, 'D');
        String s_int = "1234";
        i = Integer.parseInt(s_int);
        int addresss1=System.identityHashCode(s1);
        System.out.println(addresss1);
        String str="abcde";
        System.out.println(str.compareTo("cat"));
    }
}

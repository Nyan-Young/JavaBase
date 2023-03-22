package _U4;

public class CountSubstring {
    public static int countSubstring(String s,String sub) {
        //统计sub在串s中出现的次数
        int count = 0, len = sub.length();
        while (s.indexOf(sub) >= 0) {
            count++;
            s = s.substring(s.indexOf(sub) + len);
        }
        return count;

    }
    public static void main(String[] args) {
        String s="This is a book.";
        System.out.println(countSubstring(s,"is"));
    }

}

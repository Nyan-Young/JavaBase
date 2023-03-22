package _U4;
public class IntegerTest {
    public static void main(String[] args) { // 主方法
        String str = Integer.toString(456);
        String str2 = Integer.toBinaryString(456); // 获取数字的二进制表示
        int i=Integer.parseInt("456");
        int maxint=Integer.MAX_VALUE;//int最大取值
        int intsize=Integer.SIZE;//int的二进制位数
        System.out.println("'456'的十进制表示为：" + str);
        System.out.println("'456'的二进制表示为：" + str2);
        System.out.println("\"456\"转换为十进制为：" + i);
        System.out.println("int类型的最大取值为：" + maxint);
        System.out.println("int类型的二进制位数为：" + intsize);
    }
}

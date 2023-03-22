package _U7;

class Single{
    private String name;
    private static Single onlyOne = new Single();
    private Single(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Single getSingle(){
        return onlyOne;
    }
}

public class TestSingle {
    public static void m1(){
        Single s2 = Single.getSingle();
        System.out.println(s2.getName());
    }

    public static void main(String[] args) {
        Single s1 = Single.getSingle();
        s1.setName("Tom");
        m1();
    }
}

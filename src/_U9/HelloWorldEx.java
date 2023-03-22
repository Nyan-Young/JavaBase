package _U9;

public class HelloWorldEx {
    public static void main(String[] args) {
        int i=0;
        String[] greetings ={"Hello", "No, I mean it!", "HELLO WORLD!"};
        while (i<4){
            try {
                System.out.println(greetings[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Re-setting index value");
                break;
            } catch (Exception e){
                System.out.println(e.toString());
                break;
            } finally {
                System.out.println("This is always printed");
            }
            i++;
        }
        System.out.println("Program......");
        try {
            return;
        } finally {
            System.out.println("finally");
        }
    }
}

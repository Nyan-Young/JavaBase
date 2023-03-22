package _U7;

public class PackageTest {
    private int pri_1=1;
    protected int pro_2=2;
    int i_3=3;
    public int pub_4=4;
    public PackageTest(){};
    public void show(){
        System.out.println(pri_1);
        System.out.println(pro_2);
        System.out.println(i_3);
        System.out.println(pub_4);
    }

    public int getPri_1() {
        return pri_1;
    }

    public void setPri_1(int pri_1) {
        if(pri_1>=0){
            this.pri_1=pri_1;
        }else{
            System.out.println("Error!");
        }
    }
}

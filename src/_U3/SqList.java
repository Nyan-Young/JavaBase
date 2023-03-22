package _U3;
import java.util.Scanner;
public class SqList {
    int elem[];  //存储一组数据
    int length;  //顺序表的当前长度
    SqList(int n){//构造器，用来初始化顺序表，最大长度为n
        elem=new int[n];
        length=0;
    }
    void  inputList(int m) { //对顺序表输入m个整数
        if(m>elem.length) {
            System.out.println(m+"过大！超过数组长度！");
            return;
        }
        System.out.println("请输入"+m+"个整数:");
        Scanner reader=new Scanner(System.in);
        for(int i=0;i<m;i++)
            elem[i]=reader.nextInt();
        reader.close();
        length=m;  //顺序表的当前长度为m
    }
    void  printList() { //输出顺序表中的数据，每5个一换行
        System.out.print("数组中的数据为：");
        for(int i=0;i<length;i++) {
            if(i%5==0) System.out.println();
            System.out.print(elem[i]+"  ");
        }
        System.out.println();
    }
    int minList() {
        int min;
        min=elem[0];
        for(int i=1;i<length;i++)
            if(elem[i]<min) min = elem[i];
        return min;
    }
    boolean insertList(int i,int e) {
        //在第i个元素前插入一个元素e，插入成功返回true，插入失败返回false
        if(i<1   ||  i>length+1)  return false;
        if(length>=elem.length) return false;
        for(int j=length-1;j>=i-1;j--)
            elem[j+1]=elem[j];
        elem[i-1]=e;
        length++;
        return true;
    }
    boolean insertSort(int e) {
        boolean flag1 = false, flag2;
        int i;
        for(i = 0; i < length; i++){
            if(elem[i] >= e){
                flag1 = true;
                break;
            }
        }
        if(!flag1){
            i++;
        }
        flag2 = insertList(i, e);
        return flag2;
    }
    boolean deleteList(int i) {
        //删除第i个元素，删除成功返回true，删除失败返回false
        if(i < 0 || i >= elem.length){
            return false;
        }
        for(int j = i; j < elem.length - 1; j++){
            elem[j] = elem[j + 1];
        }
        length--;
        return true;
    }
    public static void main(String[] args) {// 程序的入口
        SqList  L=new SqList(100);
        L.inputList(5);
        L.printList();
        System.out.println("顺序表中的最小元素的值为："+L.minList());
//        if(L.insertList(3,999)==true)
//            System.out.println("charuchenggong!");
//        L.deleteList(2);
//        L.printList();
		if(L.deleteList(4)==true)
			System.out.println("deletechenggong!");
		System.out.println("---删除后---");
		L.printList();
    }

}

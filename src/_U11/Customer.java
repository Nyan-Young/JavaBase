package _U11;
import java.io.Serializable;
class Customer implements Serializable {  //���л�
	private String name;
	private int age;
	private double money;
	private transient String password; // �޷����л�
	public Customer() {}
	public Customer(String name, int age, String password,  double money) {
		this.name = name;
		this.age = age;
		this.password = password;
		this.money = money;
	}
	public String getName() {return name;}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {return age;}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoney() {return money;}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getPassword() {return password;}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "name=" + name + " age=" + age 
		          + " password=" + password
		              + " money=" + money;

	}
}

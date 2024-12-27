package Lec25;

public class Person_Client {
	public static void main(String[] args) {
		System.out.println("hello");
		Person p = new Person();
		Person p1 = new Person("Raju", 23); 
		p1.fun();
		System.out.println(p1.getAge());
		// System.out.println(p.name);
        // System.out.println(p.age);
		p.setName("Rajesh");
		System.out.println(p.getName());
		p.setAge(-9);
		System.out.println(p.getAge());
	
	}
}

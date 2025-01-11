package Lec25;

public class Person {
    // Instance variables (fields)
	private String name = "Kaju";
	private int age = 21;

    // default constructor
	public Person() {

	}
    // parameterized constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void fun() {
		System.out.println("Hello Fun");
	}

	public String getName() {
		return this.name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("age nhi hoga ");
			return;
		}
		this.age = age;
	}

}

// you use this keyword only when you need to distinguish between instance variables and local variables or parameters with the same name



// Without any constructors, you can create objects, but the instance variables will have default values.
// With a parameterized constructor, you can pass arguments while creating the object to initialize instance variables with specific values.

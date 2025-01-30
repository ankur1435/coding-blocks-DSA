package Lec29;

import java.util.Arrays;

public class Student { 

	String name = "Kaju";
	int age = 22;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	// see aisa samgho ki toString namka koi super class me method hota h aur uska kam h address ko print karna object ke but mai kya kiya ki uss toString ke kam kohi change karwa diya ab ye mere hisab se kam karega jab bhi address ko print karunga
	@Override
	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
		Student s = new Student("Raj", 22);
		Student s1 = new Student("Ankit", 23);
		int [] arr  = new int [7];
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		// Arrays.toString(arr) is a static method from the Arrays class in Java that returns a string representation of the array arr.
		System.out.println(s);
		System.out.println(s1);
	}
}


// toString() is a method defined in the Object class (the superclass of all classes in Java).
// .By default, it returns the memory address of the object.
// .When you override toString() in your class (like Student), you're changing what happens when an object is printed or converted to a string.
// .System.out.println() and other methods that print objects internally call the toString() method of the object.
// .So, when you call System.out.println(s) on your Student object, Java calls your overridden toString() method (not the one from Object class), and prints whatever you defined in that method (like "Raj 22").

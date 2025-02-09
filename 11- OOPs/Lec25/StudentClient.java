package Lec25;

//import java.util.ArrayList;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome ");
		Student s = new Student();
		s.name = "kaju";
		s.age = 20;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Raj";
		s1.age = 21;
		s1.Intro_yourSelf();
		s1.SayHey("Ramesh");
		System.out.println(s.MentorName());
		// static functions can be called by class not need of objects
		System.out.println(Student.MentorName());

	}

	static {
		System.out.println("I am in Static  Block Main");
	}

}

// Static blocks in a class are executed when the class is loaded, before the
// main method starts. Static blocks within a class execute in the order they
// appear. So, static blocks in the Student class run first, then the
// StudentClient static block, and then the main method.
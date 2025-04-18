package Lec14;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";// if there is already a string which have value hello then this one will not be
							// created will reuse that one only
		String s3 = new String("hello");// always creates a new one if already there with same value and this store the
										// string in heap.
		String s4 = new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		s1 = s1 + "bye"; // s1.concat("bye");
		String s6 = "Hello" + "Bye";
		System.out.println(s6);

	}

}

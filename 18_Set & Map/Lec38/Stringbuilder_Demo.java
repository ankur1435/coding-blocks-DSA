package Lec38;

public class Stringbuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuilder class in Java, which is used for mutable (modifiable) strings.
		StringBuilder sb = new StringBuilder();// By default, it has an initial capacity of 16 characters.
		System.out.println(sb.capacity());// If capacity is exceeded, it doubles to (old capacity * 2) + 2.
		sb.append("Raj");
		sb.append('a');
		sb.append(10);
		sb.append(true);
		sb.append("bye");
		sb.append("lll");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		System.out.println(sb.substring(1));
		System.out.println(sb.substring(1, 3));
		String s = sb.toString();
		System.out.println(sb.length());
		sb.append('a');
		System.out.println(sb.capacity());
	}

}

package Lec35;

public class Client implements A {

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub

	}

	@Override
	public int get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub

	}

	// if you forgot to override any method than it will throw a compile time error
	public static void main(String[] args) {
		Client c = new Client();
		c.fun();
	}

}

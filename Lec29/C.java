package Lec29;

public class C extends P {
	// Class C has all the data members of P because C inherits from P, so you can assign an object of type C to a variable of type P. The reverse is not true.
	int d = 2;
	int d2 = 20;
 
	public void fun() {
		System.out.println("Fun in C");
	}

	public void fun2() {
		System.out.println("Fun2 in C");
	}
}

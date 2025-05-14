package Lec29;
 
public class Client { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// // 1. case
		// P obj = new P();
		// System.out.println(obj.d);
		// System.out.println(obj.d1);
		// obj.fun();
		// obj.fun1();

		// // 2. case
		// P obj = new C();
		// Only the members declared in P can be accessed directly.
		// Members in C (like d2) are not accessible unless the object is explicitly
		// cast to type C.
		// System.out.println(obj.d); // Accesses 'd' from P
		// System.out.println(obj.d1); // Accesses 'd1' from P
		// System.out.println(obj.d2); // Compile-time error: 'd2' is not defined in
		// P
		// System.out.println(((C) obj).d2);// 20
		// System.out.println(((C) obj).d);// 2
		// obj.fun(); // Executes 'fun()' from C (runtime polymorphism)
		// obj.fun1(); // Executes 'fun1()' from P
		// ((C) obj).fun2();

		// // 3. case
		// C obj = new P();
		// This case will not compile because P is the superclass of C, and you
		// cannot assign a parent type (P) object to a child type (C) reference without
		// explicit casting.
		// System.out.println(obj.d);// 1
		// System.out.println(obj.d1);// 10
		// System.out.println(((C) obj).d2);// 20
		// System.out.println(((C) obj).d);// 2
		// obj.fun();// C
		// obj.fun1();
		// obj.fun2();

		// 4. case
		C obj = new C();
		P obj1 = new P();
		System.out.println(obj.d);// 2
		System.out.println(obj.d1);// 10
		System.out.println(obj.d2);// 20
		System.out.println(((P) obj).d);// 2
		((P) obj).fun();// C
		obj.fun();// C
		obj.fun1();
		obj.fun2();
		System.out.println(obj);// will print object memory address obj
		System.out.println(obj1); // will print object memory address of obj1
	}

}

// Definition: Runtime polymorphism (or dynamic polymorphism) occurs when a
// method call to an overridden method is resolved at runtime, based on the
// actual object type.
// Key Points:
// 1: It applies only to methods, not to data members.
// 2: The method that gets executed depends on the actual object type (C here)
// and not the reference type (P).

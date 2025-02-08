package Lec29;

// Wildcard import: import Lec26.*; (imports all classes in the Lec26 package)
import Lec26.Queue; // You can access a public class from anywhere, but you still need to use import to tell Java where to find the class if it's in a different package

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] new_arr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				new_arr[i] = arr[idx];
			}
			front = 0;// no need of this line because front is never going to change we are just
						// coping the data of old array into new array nowhere front is getting change
			arr = new_arr; // you are updating the reference of the arr (the original queue's array) to
							// point to the new, larger array (new_arr)

		}
		super.Enqueue(item);// we are writing this line so that it will bring the whole code Enqueue from
							// class Queue and we dont need to write it here
	}

	public static void main(String[] args) throws Exception {
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		System.out.println(dq.Deqeuue());
		System.out.println(dq.Deqeuue());
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Display();
	}

}

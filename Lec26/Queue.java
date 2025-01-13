package Lec26;

public class Queue {
	protected int[] arr;
	private int size = 0;// size
	protected int front = 0;

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public Queue() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public int size() {
		return size;
	}

	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol Queue  full h");
		}
        // Instead of using front + size, you can directly use size % arr.length to find the correct index for the new element, because: front is always 0
		// 
		int idx = (front + size) % arr.length;
		// front + size ensures you are always inserting the new element at the correct position, at the end of the queue.
		// % arr.length: This ensures that the index is wrapped around circularly if we reach the end of the array. So, if the index exceeds the array size, it will loop back to the start of the array (circular behavior).
		//  Without it, we'd run into out-of-bounds errors,
		arr[idx] = item;
		size++;
	}

	public int Deqeuue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue  khaali h");
		}
		int v = arr[front];
		//front ko ab update karna hoga qki ak element to nikal gya h and we are using % arr.length because queue is circular
		front = (front + 1) % arr.length;
		size--;
		return v;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue  khaali h");
		}
		return arr[front];
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = i % arr.length;
			// int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}













package Lec26;

public class Queue {
	private int[] arr;
	private int size = 0;// size
	private int front = 0;

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
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		size++;
	}

	public int Deqeuue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue  khaali h");
		}
		int v = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return v;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue  khaali h");
		}
		int v = arr[front];
		return v;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}













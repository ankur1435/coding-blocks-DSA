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
		// isfull of queue is different from stack because in stack we are using idx
		// (top) but in queue we are using size
		return size == arr.length;
	}

	public int size() {
		return size;
	}

	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol Queue  full h");
		}
		// Instead of using front + size, you can directly use size % arr.length to find
		// the correct index for the new element, because: front is always 0
		//
		int idx = (front + size) % arr.length;
		// isko aisa samgho ki size 0 se start ho rahi h 1 se nahi ho rahi h issiliye
		// ham size ko leke chal rahe h because of zero based indexing size hamesha agle
		// wale ko point karega aur hame ussi per rakhna h
		// front + size ensures you are always inserting the new element at the correct
		// position, at the end of the queue.
		// % arr.length: This ensures that the index is wrapped around circularly if we
		// reach the end of the array. So, if the index exceeds the array size, it will
		// loop back to the start of the array (circular behavior).
		// Without it, we'd run into out-of-bounds errors,
		arr[idx] = item;
		size++;
		// front tells you where the queue starts. size tells you how many elements are
		// in it. front + size calculates the next available slot, and % arr.length
		// handles the wrap-around for circular queues. You need both front and size to
		// find the correct insertion point.
	}

	public int Deqeuue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Queue  khaali h");
		}
		int v = arr[front];
		// front ko ab update karna hoga qki ak element to nikal gya h and we are using
		// % arr.length because queue is circular
		// front ko size ke jaisa mat mano jo front ke pichhe khada h wo ab front banega
		// uske loye plus use hua h
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
			// size means how many elements are there in the queue
			int idx = (front + i) % arr.length;
			// Imagine a circular queue (size 5) with front at index 2 and 3 elements. The
			// elements are at indices 2, 3, and 4. i counts from 0 to 2 (the size). front +
			// i (2+0, 2+1, 2+2) gives the correct indices (2, 3, 4) even though i is just
			// 0, 1, 2. Without front, you'd start at 0, printing wrong values.
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
		// Non-Contiguous Storage: In a circular queue, the elements might be "wrapped
		// around" the array. For example, if the queue has wrapped, the first element
		// might be at arr[3], the second at arr[4], and the third at arr[0]. They are
		// not stored in the natural order of indices 0, 1, 2.
	}
}

package Lec26;

public class Stack {

	protected int[] arr;
	// Tracks the topmost element of the stack.
	// Initialized to -1 because an empty stack has no valid index.
	private int idx = -1; // ji

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		this.arr = new int[n];
	}

	public Stack() {
		// Calls the parameterized constructor with a default size of 5.
		// If no size is provided while creating a Stack object, the stack will have a
		// size of 5
		this(5);
	}

	public boolean isEmpty() {
		if (idx == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		// The size() method returns idx + 1 because idx is zero-based (indicating the
		// index of the top element), while size is one-based (indicating the count of
		// elements in the stack).
		// idx -1 se start ho rha h means koi data nahi h qki 0 based indexinng h to
		// zahir si bat h idx + 1 hi size hoga pure ka jaisa array me hota h
		return idx + 1;
	}

	public boolean isFull() {
		return idx == arr.length - 1; // arr.length is the total capacity, while arr.length - 1 is the index of the
										// last valid element. idx points to an element within the array, so it can only
										// go up to arr.length - 1.
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Bklol stack full hai ");
		}
		idx++;
		arr[idx] = item;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol stack Empty hai ");
		}
		return arr[idx];
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol stack Empty hai ");
		}
		int v = arr[idx];
		idx--;
		return v;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			// yaha arr.length nahi hoga qki idx top element h aur hame top tak jana h
			// zaruri nahi h arr ke and tak sare elements bhare ho agar arr.length tak
			// jaunga to kuchh aisa access karega jaha koi element nahi h
			// The key distinction here is that idx doesn't represent the total capacity of
			// the stack or the array's length
			// idx represents the topmost occupied index of the stack. This is why the
			// condition is i <= idx rather than i < arr.length.
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

// yaha ak cheej yad rakhne wali bat h ki idx top ka element ko dikha raha h
// lekin queue wale me size tha jisme top (sabse agge) size -1 tha aur size per
// ham naye element ko rakhte the

package Lec26;

public class Stack {

	protected int[] arr;
	// Tracks the topmost element of the stack.
    // Initialized to -1 because an empty stack has no valid index.
	private int idx = -1;

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		this.arr = new int[n];
	}

	public Stack() {
		// Calls the parameterized constructor with a default size of 5.
        // If no size is provided while creating a Stack object, the stack will have a size of 5
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
		// The size() method returns idx + 1 because idx is zero-based (indicating the index of the top element), while size is one-based (indicating the count of elements in the stack).
		// idx -1 se start ho rha h means koi data nahi h qki 0 based indexinng h to zahir si bat h idx + 1 hi size hoga pure ka jaisa array me hota h
		return idx + 1;
	} 

	public boolean isFull() {
		return size() == arr.length;
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
			// The key distinction here is that idx doesn't represent the total capacity of the stack or the array's length
			//idx represents the topmost occupied index of the stack. This is why the condition is i <= idx rather than i < arr.length.
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}



// yaha ak cheej yad rakhne wali bat h ki idx top ka element ko dikha raha h lekin queue wale me size tha jisme top (sabse agge) size -1 tha aur size per ham naye element ko rakhte the

package Lec39;

import java.util.ArrayList;

public class HashMap<K, V> {

	class Node {
		K Key;
		V value;
		// This means that K (Key) and V (Value) can be replaced with any data type when
		// creating an instance of HashMap.
		Node next;
	}

	private ArrayList<Node> bukt;
	private int size = 0;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	// a Constructor that takes an integer as an argument and creates an ArrayList
	// of size n
	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}
	}

	// example:
	// HashMap<String, Integer> map = new HashMap<>(5);
	// Creates a HashMap with 5 empty buckets

	public int hashfun(K key) {
		int idx = key.hashCode() % bukt.size();
		if (idx < 0) {
			idx += bukt.size();// If the index is negative, we make it positive by adding the bucket size
		}
		return idx;
	}

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.Key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp = bukt.get(idx);
		Node nn = new Node();
		nn.Key = key;
		nn.value = value;
		nn.next = temp;
		bukt.set(idx, nn);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / bukt.size();
		if (lf > thf) {
			rehashing();
		}
	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> new_bukt = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			new_bukt.add(null);
		}
		ArrayList<Node> old_bukt = bukt;
		bukt = new_bukt;
		size = 0;
		for (Node temp : old_bukt) {
			while (temp != null) {
				put(temp.Key, temp.value);
				temp = temp.next;
			}
		}

	}

	public String toString() {
		String s = "{";
		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.Key + "=" + temp.value + ", ";
				temp = temp.next;
			}
		}
		return s + "}";

	}

	// containskey
	public boolean containsKey(K key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.Key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	// get
	public V get(K key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.Key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.Key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			bukt.set(idx, curr.next);

		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return curr.value;
	}

	public int size() {
		return size;
	}
}

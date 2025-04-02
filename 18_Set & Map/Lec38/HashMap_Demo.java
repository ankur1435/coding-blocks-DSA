package Lec38;

import java.util.*;
 
public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();// It does not maintain any order.
		// Keys must be unique. If a key already exists, the new value overwrites the
		// old value.
		map.put("Raj", 87);
		map.put("Kunal", 58);
		map.put("Ankita", 78);
		map.put("Ankit", 87);
		map.put("Kaju", 78);
		map.put("Amisha", 77);
		map.put("Manoj", 68);
		map.put("Puneet", 57);
		map.put("Kaju", 6);
		// map.put(null, 77);// this line allow in HashMap ans LinkedHashMap but not in
		// TreeMap
		// map.put(null, 7);
		System.out.println(map);
		// .size() returns the number of key-value pairs in the map.
		System.out.println(map.size());
		// // containsKey
		// System.out.println(map.containsKey("Amit"));
		// System.out.println(map.containsKey("Ankit"));
		// // get : returns the value associated with the key
		// System.out.println(map.get("Ankit"));
		// System.out.println(map.get("Amit"));
		// //remove
		// System.out.println(map.remove("Amit"));
		// System.out.println(map.remove("Ankit"));
		// System.out.println(map);

		TreeMap<String, Integer> map1 = new TreeMap<>();// Creates a LinkedHashMap which maintains insertion order.
		// Creates a TreeMap which maintains keys in sorted order.
		map1.put("Raj", 87);
		map1.put("Kunal", 58);
		map1.put("Ankita", 78);
		map1.put("Ankit", 87);
		map1.put("Kaju", 78);
		map1.put("Amisha", 77);
		map1.put("Manoj", 68);
		map1.put("Puneet", 57);
		map1.put("Kaju", 6);
		// map1.put(null, 77);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Raj", 87);
		map2.put("Kunal", 58);
		map2.put("Ankita", 78);
		map2.put("Ankit", 87);
		map2.put("Kaju", 78);
		map2.put("Amisha", 77);
		map2.put("Manoj", 68);
		map2.put("Puneet", 57);
		map2.put("Kaju", 6);
		System.out.println(map2);
		// Set<String> s = map.keySet();
		// System.out.println(s);
		// for(String k:s) {
		// System.out.println(k+" "+map.get(k));
		// }
		for (String k : map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}

	}

}

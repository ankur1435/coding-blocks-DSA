package Lec15;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		printallsubstring(s);
	} 

	public static void printallsubstring(String s) {
		int c = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 0; len < s.length(); len++) {
			for (int j = len + 1; j <= s.length(); j++) {
				long x = Long.parseLong(s.substring(len, j));
				if (isCB_Numbers(x) && isvisited(visited, len, j)) {
					c++;
					for (int k = len; k < j; k++) {
						visited[k] = true;
					}
				}

			}
		}
		System.out.println(c);
	}
	public static boolean isvisited(boolean[] visited, int si, int ei) {
		for (int i = si; i < ei; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCB_Numbers(long nums) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (nums == 0 || nums == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (nums == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (nums % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}

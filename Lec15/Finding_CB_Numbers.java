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
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                long x = Long.parseLong(s.substring(i, j));
                if (isCB_Numbers(x) && isvisited(visited, i, j - 1)) {
					// We pass j-1 instead of j because j is the end index for the substring, but in Java, the substring() method is exclusive of the end inde
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    public static boolean isvisited(boolean[] visited, int si, int ei) {
        for (int i = si; i <= ei; i++) {
            if (visited[i] == true) {  // Check if already visited
                return false;
            }
            visited[i] = true;  // Mark the index as visited
        }
        return true;
    }

    public static boolean isCB_Numbers(long nums) {
        if (nums == 0 || nums == 1) {
            return false;
        }
        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
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

	// Any return statement (true or false) will immediately exit the method, skipping all further checks, including the final return true.
    // The final return true is only reached if none of the earlier conditions trigger a return.


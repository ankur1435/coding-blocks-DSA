package Lec12;

public class Spiral_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		print(arr);
	}

	public static void print(int[][] arr) {
		int minr = 0, minc = 0, maxr = arr.length - 1, maxc = arr[0].length - 1;
		int te = arr.length * arr[0].length;// total number of elements in the array
		int c = 0;
		while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				System.out.print(arr[minr][i] + " ");
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				System.out.print(arr[i][maxc] + " ");
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				System.out.print(arr[maxr][i] + " ");
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
				System.out.print(arr[i][minc] + " ");
				c++;
			}
			minc++;
		}
	}
}

// Without c < te inside each loop, these loops might over run their boundaries
// and attempt to process elements unnecessarily (even though the while loop has
// the main condition).

// Removing c < te from the for loops might work for most cases, but it
// introduces a risk of bugs in Edge Cases (e.g., single row/column arrays or
// irregular dimensions)

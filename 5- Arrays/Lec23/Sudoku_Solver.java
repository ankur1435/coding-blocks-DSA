package Lec23;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
				{ 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 },
				{ 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 7, 4 },
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Print(grid, 0, 0);
		Display(grid);

	}

	public static void Display(int[][] grid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean Print(int[][] grid, int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {//
			return true;
		}
		if (grid[row][col] != 0) {
			return Print(grid, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (issafe(grid, row, col, val)) {
					grid[row][col] = val;
					boolean ans = Print(grid, row, col + 1);
					if (ans) {
						return ans;
					}
					grid[row][col] = 0;
				}
			}
		}
		return false;

	}

	public static boolean issafe(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		// row me check
		for (int c = 0; c < 9; c++) {
			if (grid[row][c] == val) {
				return false;
			}
		}
		// col me check
		for (int r = 0; r < 9; r++) {
			if (grid[r][col] == val) {
				return false;
			}
		}
		// 3*3 Matrix
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}
			}
		}
		return true;

	}

}

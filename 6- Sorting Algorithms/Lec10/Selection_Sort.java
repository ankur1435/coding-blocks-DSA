package Lec10;

public class Selection_Sort {
    public static void main(String[] args) {

        int[] arr = { 4, -1, 5, 3, 1, 2 };
        SelectionSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println(Min_Iddex(arr, 2)); //

    }

    public static int[] SelectionSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestIdx] > arr[j]) {
                    smallestIdx = j;
                }
            }
            int temp = arr[smallestIdx];
            arr[smallestIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}

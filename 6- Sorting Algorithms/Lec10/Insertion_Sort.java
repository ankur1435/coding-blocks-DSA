package Lec10;

public class Insertion_Sort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 2, 3, 11, 12, 6, 4, 5, 8, 9 };
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            // j is the track of unsorted elements
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }
}

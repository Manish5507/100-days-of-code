import java.util.Arrays;

public class bubblesort {
   public static void main(String args[]) {
        int arr[] = {2, 7, 1, 4};
        int n = arr.length;
        int temp = 0;

        System.out.println("Original array: " + Arrays.toString(arr));

        // This is the standard bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

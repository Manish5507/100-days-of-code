import java.util.Arrays;

// It's a common convention in Java to start class names with a capital letter.
class PlusOne { 
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // This part only runs if all digits were 9s
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String args[]) {
        // Create an instance of the class
        PlusOne po = new PlusOne();

        // Create a sample input array
        int[] inputArray = {9, 9}; 

        // Call the plusOne method
        int[] resultArray = po.plusOne(inputArray);

        // Print the result to the console for verification
        // Arrays.toString() is a handy way to print array contents
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Result Array:   " + Arrays.toString(resultArray)); 
        // Expected Output: [1, 0, 0]
    }
}
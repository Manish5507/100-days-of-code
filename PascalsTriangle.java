import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    /**
     * Generates a single row of Pascal's Triangle.
     * For example, generateRow(4) will return [1, 3, 3, 1].
     * @param rowNum The row number (1-indexed).
     * @return A list of integers representing the row.
     */
    public static List<Integer> generateRow(int rowNum) {
        long ans = 1; // Use 'long' to prevent overflow with large numbers
        List<Integer> ansRow = new ArrayList<>();
        
        // The first element in any row is always 1
        ansRow.add(1);

        // Calculate the rest of the elements in the row
        for (int col = 1; col < rowNum; col++) {
            ans = ans * (rowNum - col);
            ans = ans / col;
            ansRow.add((int) ans); // Cast back to int before adding
        }
        return ansRow;
    }

    /**
     * Generates the full Pascal's Triangle up to N rows.
     * @param N The total number of rows to generate.
     * @return A list of lists, where each inner list is a row of the triangle.
     */
    public static List<List<Integer>> pascalTriangle(int N) {
        List<List<Integer>> fullTriangle = new ArrayList<>();

        // Generate each row from 1 to N and add it to the final list
        for (int i = 1; i <= N; i++) {
            fullTriangle.add(generateRow(i));
        }
        return fullTriangle;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int numberOfRows = 5;
        List<List<Integer>> triangle = pascalTriangle(numberOfRows);

        // Print the generated triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
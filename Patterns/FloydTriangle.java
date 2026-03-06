// Problem: Floyd's Triangle Pattern
// Concept: Nested Loops, Incremental Number Pattern

// Description:
// Print Floyd's Triangle where numbers increase sequentially across rows. Each row contains one more number than the previous row.

// Pattern (n = 4):
// 1
// 2 3
// 4 5 6
// 7 8 9 10

// Approach:
// - Use an outer loop to control rows from 1 to n.
// - Maintain a variable 'inc' to store the current number.
// - Inner loop prints numbers equal to the row number (i).
// - After printing each number, increment 'inc'.
// - Move to the next line after each row.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class FloydTriangle {
  public static void floydsPattern() {
    int n = 4;
    int inc = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(inc + " ");
        inc += 1;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    floydsPattern();
  }
}

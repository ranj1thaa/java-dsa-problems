// Problem: Half Pyramid with Numbers
// Concept: Nested Loops, Number Pattern

// Description:
// Print a half pyramid pattern using numbers. In each row, numbers start from 1 and increase sequentially up to the row number.

// Pattern (n = 4):
// 1
// 12
// 123
// 1234

// Approach:
// - Outer loop controls the rows from 1 to n.
// - Inner loop prints numbers from 1 up to the current row number (i).
// - After printing each row, move to the next line.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class HalfPyramid {
  public static void halfPyramidPattern() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    halfPyramidPattern();
  }
}

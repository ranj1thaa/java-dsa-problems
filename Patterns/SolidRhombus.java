// Problem: Solid Rhombus Pattern
// Concept: Nested Loops, Pattern Printing

// Description:
// Print a solid rhombus pattern of stars. rhombus looks like a slanted rectangle.  pattern is created by printing spaces before the stars in each row.

// Pattern (n = 5):
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

// Approach:
// - Use an outer loop to iterate through rows.
// - First inner loop prints spaces (n - i) to shift stars right.
// - Second inner loop prints m stars in each row.
// - Move to the next line after printing stars.

// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class SolidRhombus {
  public static void solidRhombusPattern() {
    int n = 5;
    int m = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" " + " ");
      }
      for (int j = 1; j <= m; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    solidRhombusPattern();
  }
}

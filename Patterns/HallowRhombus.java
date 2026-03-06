// Problem: Hollow Rhombus Pattern
// Concept: Nested Loops, Pattern Printing, Boundary Conditions

// Description:
// Print a hollow rhombus using stars. The rhombus is formed by shifting rows using spaces and printing stars only on the boundary (first row, last row, first column, last column).

// Pattern (n = 5):
//         * * * * *
//       *       *
//     *       *
//   *       *
// * * * * *

// Approach:
// - Outer loop controls rows from 1 to n.
// - First inner loop prints spaces (n - i) to shift the rhombus right.
// - Second inner loop prints columns from 1 to m.
// - Print '*' only when:
//      • first row (i == 1)
//      • last row (i == n)
//      • first column (j == 1)
//      • last column (j == m)
// - Otherwise print spaces to keep the inside hollow.

// Time Complexity: O(n × m)
// Space Complexity: O(1)

public class HallowRhombus {
  public static void hallowRhombusPattern() {
    int n = 5;
    int m = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m - i; j++) {
        System.out.print(" " + " ");
      }
      for (int j = 1; j <= m; j++) {
        if (j == 1 || j == m || i == 1 || i == n) {
          System.out.print("*" + " ");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    hallowRhombusPattern();
  }
}

// Problem: Hollow Rectangle Pattern
// Concept: Nested Loops, Conditional Pattern Logic

// Description:
// Print a hollow rectangle made of stars. Only the boundary of the rectangle contains stars, while the inner area is empty.

// Pattern (n = 4):
// * * * *
// *     *
// *     *
// * * * *

// Approach:
// - Use an outer loop to iterate through rows.
// - Use an inner loop to iterate through columns.
// - Print '*' if the element is on the boundary:
//      • first row (i == 1)
//      • last row (i == n)
//      • first column (j == 1)
//      • last column (j == n)
// - Otherwise print space to keep the inside hollow.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class HollowRectangle {
  public static void hallowPattern() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n) {
          System.out.print("*" + " ");
        } else {
          System.out.print(" " + " ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    hallowPattern();
  }
}

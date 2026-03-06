// Problem: Inverted Rotated Half Pyramid Pattern
// Concept: Nested Loops, Pattern Printing

// Description:
// Print a right-aligned (rotated) half pyramid using stars. Spaces are printed before the stars so the pyramid appears shifted to the right.

// Pattern (n = 4):
//       *
//     * *
//   * * *
// * * * *

// Approach:
// - Outer loop controls rows from 1 to n.
// - First inner loop prints spaces (n - i) to shift the stars right.
// - Second inner loop prints stars equal to the row number (i).
// - Move to the next line after printing each row.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class InvertedRotated {
  public static void invertedRotatedPattern() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" " + " ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    invertedRotatedPattern();
  }
}

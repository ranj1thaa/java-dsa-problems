// Problem: Number Pyramid Pattern
// Concept: Nested Loops, Pattern Printing

// Description:
// Print a pyramid pattern where each row contains the same number repeated multiple times equal to the row number.

// Pattern (n = 4):
//    1
//   2 2
//  3 3 3
// 4 4 4 4

// Approach:
// - Outer loop controls the rows from 1 to n
// - First inner loop prints spaces (n - i) to center the pyramid
// - Second inner loop prints the number i, repeated i times
// - Move to the next line after each row

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class NumberPyramid {
  public static void numberPyramidPattern() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    numberPyramidPattern();
  }
}

// Problem: Diamond Star Pattern

// Concept: Nested Loops, Pattern Printing

// Description:
// Print a diamond-shaped star pattern using two parts:
// 1. Upper pyramid
// 2. Lower inverted pyramid

// Pattern (n = 4):
//       *
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

// Approach:
// - The diamond is divided into two sections:
//   1️. Upper half (increasing stars)
//   2️. Lower half (decreasing stars)
//
// Upper Half:
// - Outer loop runs from 1 to n.
// - First inner loop prints spaces to center the pyramid.
// - Second loop prints stars from 1 to i.
// - Third loop prints stars from 1 to i-1 to complete the pyramid width.
//
// Lower Half:
// - Outer loop runs from n down to 1.
// - First inner loop prints spaces.
// - Next loops print decreasing stars similar to the upper half.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class Diamond {
  public static void diamondPattern() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" " + " ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      for (int j = 1; j < i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" " + " ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      for (int j = 1; j < i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    diamondPattern();
  }
}

// Problem: Butterfly Star Pattern

// Concept: Nested Loops, Symmetrical Pattern Printing

// Description:
// Print a butterfly-shaped star pattern using two symmetric parts.
// The pattern consists of:
// 1️. Upper half (wings expanding)
// 2️. Lower half (wings shrinking)

// Pattern (n = 4):
// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

// Approach:
// The pattern is divided into two sections.

// Upper Half:
// - Outer loop runs from 1 to n.
// - First inner loop prints stars from 1 to i (left wing).
// - Second inner loop prints spaces equal to 2 * (n - i).
// - Third inner loop prints stars from 1 to i again (right wing).

// Lower Half:
// - Outer loop runs from n down to 1.
// - The same logic is repeated but stars decrease each row,
//   creating the shrinking part of the butterfly.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class Butterfly {
  public static void butterflyPattern() {
    int n = 4;
    // first part
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" " + " ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    // secend part
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" " + " ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    butterflyPattern();
  }
}

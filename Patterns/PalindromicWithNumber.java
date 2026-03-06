// Problem: Palindromic Number Pyramid Pattern
// Concept: Nested Loops, Number Pattern

// Description:
// Print a palindromic pyramid pattern using numbers. Each row first prints numbers in decreasing order from i to 1,then prints numbers in increasing order from 2 to i,forming a palindrome.

// Pattern (n = 4):
//       1
//     2 1 2
//   3 2 1 2 3
// 4 3 2 1 2 3 4

// Approach:
// - Outer loop controls rows from 1 to n
// - First inner loop prints spaces (n - i) for alignment
// - Second inner loop prints decreasing numbers from i to 1
// - Third inner loop prints increasing numbers from 2 to i
// - Move to the next line after each row

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class PalindromicWithNumber {
  public static void palindromicPattern() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" " + " ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      for (int j = 1; j <= i; j++) {
        if (j > 1) {
          System.out.print(j + " ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    palindromicPattern();
  }
}
// Problem: Count Occurrences of a Key in a 2D Array
// Concept: 2D Array Traversal, Nested Loops

// Description:
// Given a 2D matrix and a key value, count how many times
// the key appears in the matrix.

// Example:
// Input Matrix:
// 4  7  8
// 8  8  7
//
// Key = 7
//
// Output:
// Count of key is: 2

// Approach:
// - Traverse the matrix using nested loops.
// - Compare each element with the given key.
// - If it matches, increment the counter.
// - Print the total count.

// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class PrintKeyCount {
  public static void printCount(int n[][], int key) {
    int count = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        if (n[i][j] == key) {
          count += 1;
        }
      }
    }
    System.out.println("Count of key is:" + count);
  }

  public static void main(String[] args) {
    int n[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
    printCount(n, 7);
  }
}

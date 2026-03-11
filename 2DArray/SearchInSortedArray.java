// Problem: Search Element in a Sorted 2D Matrix
// Concept: 2D Array Traversal, Binary Search, Staircase Search

// Description:
// Given a sorted 2D matrix, search for a specific key using three approaches:
// 1. Brute Force Search
// 2. Binary Search (treat matrix as 1D array)
// 3. Staircase Search (start from top-right)

// Example Matrix:
// 10  20  30  40
// 15  25  35  45
// 27  29  37  48
// 32  33  39  50

// Example Input:
// key = 32

// Output:
// Found key at (3,0)

// Approaches:

// 1. Brute Force
// - Traverse every element in matrix
// - If key matches, print location
// Time Complexity: O(n*m)

// 2. Binary Search
// - Treat matrix as 1D sorted array
// - Convert index back to row & column
// Time Complexity: O(log(n*m))

// 3. Staircase Search
// - Start from top-right corner
// - Move left if key is smaller
// - Move down if key is larger
// Time Complexity: O(n+m)

public class SearchInSortedArray {
  public static void bruteForceSearch(int n[][], int key) {
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        if (n[i][j] == key) {
          System.out.println("Key" + n[i][j] + " Found at" + i);
          return;
        }
      }
    }
    System.out.println("key not found");
  }

  public static void binaryWaySearch(int n[][], int key) {
    int rows = n.length;
    int cols = n[0].length;
    int left = 0;
    int right = rows * cols - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      int r = mid / cols;
      int c = mid % cols;

      if (n[r][c] == key) {
        System.out.println("Key Found");
        return;
      } else if (n[r][c] < key) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    System.out.println("Not Found");
  }

  public static void stairCaseSearch(int n[][], int key) {
    int row = 0;
    int col = n[0].length - 1;
    while (row < n.length && col >= 0) {
      if (n[row][col] == key) {
        System.out.println("Found key at (" + row + "," + col + ")");
        return;
      } else if (key < n[row][col]) {
        col--;
      } else {
        row++;
      }
    }
    System.out.println("Key not found");
  }

  public static void main(String[] args) {
    int n[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
    bruteForceSearch(n, 33);
    binaryWaySearch(n, 39);
    stairCaseSearch(n, 32);
  }
}

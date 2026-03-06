// Problem: Print All Subarrays of an Array
// Concept: Nested Loops, Array Traversal

// Description:
// Print all possible contiguous subarrays of a given array. A subarray is a continuous part of an array formed by selecting a starting index and an ending index.

// Example:
// Input: [2, 4, 6, 8]

// Output:
// 2
// 24
// 246
// 2468

// 4
// 46
// 468

// 6
// 68

// 8

// Approach:
// - Use the first loop to select the starting index (i).
// - Use the second loop to select the ending index (j).
// - Use the third loop to print elements from index i to j.
// - This ensures every possible contiguous subarray is printed.

// Time Complexity: O(n³)
// Space Complexity: O(1)

public class SubArrays {

  public static void subArray(int n[]) {
    for (int i = 0; i < n.length; i++) {
      for (int j = i; j < n.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(n[k]);
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n[] = { 2, 4, 6, 8 };
    subArray(n);
  }
}

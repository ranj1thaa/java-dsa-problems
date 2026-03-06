// Problem: Find Largest and Smallest Element in an Array
// Concept: Array Traversal, Comparison

// Description:
// Find the largest and smallest numbers present in a given array. The program scans the array once and updates the largest and smallest values whenever a bigger or smaller element is found.

// Example:
// Input: [1, 6, 2, 9, 2, 4, 10]
// Output:
// Largest: 10
// Smallest: 1

// Approach:
// - Assume the first element as both largest and smallest.
// - Traverse the array starting from index 1.
// - If the current element is greater than the assumed largest,
//   update the largest index.
// - If the current element is smaller than the assumed smallest,
//   update the smallest index.
// - After traversal, return both values using an array.
//CAn use Integer.MIN_VALUE || Integer.MAX_VALUE

// Time Complexity: O(n)
// Space Complexity: O(1)

public class LargestSmallestNumber {
  public static int[] largeSmallNum(int n[]) {
    int assumeLarge = 0;
    int assumeSmall = 0;
    for (int i = 1; i < n.length; i++) {
      if (n[assumeLarge] < n[i]) {
        assumeLarge = i;
      }
      if (n[assumeSmall] > n[i]) {
        assumeSmall = i;
      }
    }
    System.out.println("Largest number is:" + n[assumeLarge] + " and in position:" + assumeLarge);
    System.out.println("Smallest number is:" + n[assumeSmall] + " and in position:" + assumeSmall);
    return new int[] { n[assumeLarge], n[assumeSmall] };
  }

  public static void main(String[] args) {
    int n[] = { 1, 6, 2, 9, 2, 4, 10 };
    int res[] = largeSmallNum(n);
    System.out.println("Largest:" + res[0]);
    System.out.println("Smallest:" + res[1]);
  }
}

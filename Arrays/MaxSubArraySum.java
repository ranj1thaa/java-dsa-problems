// Problem: Maximum Subarray Sum (Brute Force)
// Concept: Nested Loops, Subarray Traversal

// Description:
// Find the maximum sum among all possible subarrays of a given array. A subarray is a contiguous part of the array. The goal is to compute the sum of every possible subarray and determine the maximum sum.

// Example:
// Input: [2, 4, 6, 8]

// Subarrays and sums:
// [2] = 2
// [2,4] = 6
// [2,4,6] = 12
// [2,4,6,8] = 20
// [4] = 4
// [4,6] = 10
// [4,6,8] = 18
// [6] = 6
// [6,8] = 14
// [8] = 8

// Output:
// Max: 20

// Approach:
// - Use the first loop to select the starting index (i).
// - Use the second loop to select the ending index (j).
// - Use the third loop to calculate the sum of elements from i to j.
// - Compare the current sum with the maximum sum found so far.
// - Update maxSum if the current sum is greater.
// - After checking all subarrays, print the maximum sum.

// Time Complexity: O(n³)
// Space Complexity: O(1)

public class MaxSubArraySum {

  public static void maxSum(int n[]) {
    int maxSum = 0;
    int currSum = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = i; j < n.length; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          currSum += n[k];
        }
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max:" + maxSum);
  }

  public static void main(String[] args) {
    int n[] = { 2, 4, 6, 8 };
    maxSum(n);
  }
}

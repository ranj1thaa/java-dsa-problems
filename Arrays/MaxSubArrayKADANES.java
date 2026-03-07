// Problem: Maximum Subarray Sum (Kadane’s Algorithm)
// Concept: Greedy Algorithm, Dynamic Programming, Array Traversal

// Description:
// Find the maximum possible sum of a contiguous subarray within a given integer array.
// Kadane’s Algorithm efficiently computes this by maintaining a running sum of elements.
// If the current sum becomes negative, it is reset to 0 because a negative sum would
// decrease the total of any future subarray.

// Example:
// Input:  [-3, -2, 4, -1, -2, 1, 5, -3]
// Output: 7
// Explanation:
// The subarray [4, -1, -2, 1, 5] gives the maximum sum = 7.

// Approach:
// - Initialize two variables:
//   currSum = 0 (current running sum)
//   maxSum = 0 (maximum sum found so far)
// - Traverse the array from left to right.
// - Add the current element to currSum.
// - If currSum becomes negative, reset it to 0.
// - Update maxSum using Math.max(currSum, maxSum).
// - After traversing the array, maxSum will contain the maximum subarray sum.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxSubArrayKADANES {

  public static void fn(int n[]) {
    int currSum = 0;
    int maxSum = 0;

    for (int i = 0; i < n.length; i++) {
      currSum = currSum + n[i];
      if (currSum < 0) {
        currSum = 0;
      }
      maxSum = Math.max(currSum, maxSum);
    }
    System.out.println("Max: " + maxSum);
  }

  public static void main(String[] args) {
    int n[] = { -3, -2, 4, -1, -2, 1, 5, -3 };
    fn(n);
  }
}

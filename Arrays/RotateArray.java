// Problem: Rotate Array
// Concept: Array Manipulation, Two-Pointer, Reversal Algorithm

// Description:
// Given an integer array nums, rotate the array to the right by k steps.
// The rotation must be done in-place without using extra space.

// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]

// Example 2:
// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]

// Approach:
// Instead of shifting elements one by one, we use the Reverse Algorithm.

// Steps:
// 1. Normalize k using k % nums.length to avoid unnecessary rotations.
// 2. Reverse the entire array.
// 3. Reverse the first k elements.
// 4. Reverse the remaining elements from k to end.

// Example Walkthrough:
// nums = [1,2,3,4,5,6,7], k = 3

// Step 1: Reverse whole array
// [7,6,5,4,3,2,1]

// Step 2: Reverse first k elements
// [5,6,7,4,3,2,1]

// Step 3: Reverse remaining elements
// [5,6,7,1,2,3,4]

// Time Complexity: O(n)
// Space Complexity: O(1)

public class RotateArray {
  public static void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  public static void printArr(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    rotate(nums, k);
    printArr(nums);
  }
}

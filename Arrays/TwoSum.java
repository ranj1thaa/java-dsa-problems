// Problem: Two Sum
// Concept: Array Traversal (Brute Force)

// Description:
// Given an array of integers nums and an integer target,
// return the indices of two numbers such that they add up to the target.
// Each input will have exactly one solution, and you may not use
// the same element twice. The answer can be returned in any order.

// Example:
// Input:  nums = [2, 7, 11, 15], target = 9
// Output: indices = (0, 1)
// Explanation: nums[0] + nums[1] = 2 + 7 = 9

// Approach:
// - Traverse the array using two loops.
// - Fix the first number using index i.
// - Use another loop with index j starting from i + 1.
// - Check if nums[i] + nums[j] equals the target.
// - If yes, print the indices and stop the program.
// - If no pair is found after checking all combinations,
//   print "NOT FOUND".

// Time Complexity: O(n²)
// Space Complexity: O(1)
public class TwoSum {
  public static void printTwoSum(int n[], int target) {
    for (int i = 0; i < n.length; i++) {
      for (int j = i + 1; j < n.length; j++) {
        if (n[i] + n[j] == target) {
          System.out.println("Found at: " + i + "," + j);
          return;
        }
      }
      System.out.println("NOT FOUND");
    }
  }

  public static void main(String[] args) {
    int nums[] = { 2, 7, 11, 15 };
    int target = 9;

    printTwoSum(nums, target);
  }
}

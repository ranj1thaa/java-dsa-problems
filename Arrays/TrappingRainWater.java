// Problem: Trapping Rain Water
// Concept: Prefix Arrays, Precomputation, Array Traversal

// Description:
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// The idea is that water above a bar depends on the minimum of the tallest bar to its left and the tallest bar to its right.

// Example:
// Input:  [4, 2, 0, 6, 3, 2, 5]
// Output: 11
//
// Explanation:
// Water trapped above each index depends on:
// waterLevel = min(leftMax, rightMax)
// trappedWater += waterLevel - height[i]

// Approach:
// - Create an array leftMax[] to store the maximum height to the left of each index.
// - Create an array rightMax[] to store the maximum height to the right of each index.
// - Traverse the array to fill leftMax.
// - Traverse from right to left to fill rightMax.
// - For each bar:
//      waterLevel = min(leftMax[i], rightMax[i])
//      trappedWater += waterLevel - height[i]
// - Return the total trapped water.

// Time Complexity: O(n)
// Space Complexity: O(n)

public class TrappingRainWater {
  public static int trappedRainWater(int height[]) {
    // l
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for (int i = 1; i < height.length; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }
    // r
    int rightMax[] = new int[height.length];
    rightMax[height.length - 1] = height[height.length - 1];
    for (int i = height.length - 2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    int trappedWater = 0;
    // loop
    for (int i = 0; i < height.length; i++) {
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += (waterLevel - height[i]);
    }
    return trappedWater;

  }

  public static void main(String[] args) {
    int n[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(trappedRainWater(n));
  }
}

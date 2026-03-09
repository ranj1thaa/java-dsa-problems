
// Problem: Find the Second Largest Element in an Array
// Concept: Array Traversal, Maximum Comparison

// Description:
// Find the second largest element present in an array.
// The second largest element is the element that is smaller
// than the largest element but larger than all other elements.

// Example:
// Input: [4, 2, 8, 6, 10]

// Output:
// Second largest: 8

// Explanation:
// The largest element in the array is 10.
// The next largest element after 10 is 8,
// so 8 is the second largest element.

// Approach:
// - Create a new array to store the running maximum values.
// - Set the first element of the new array equal to the first element of the input array.
// - Traverse the array starting from index 1.
// - For each element, store the maximum between the current element
//   and the previous maximum value.
// - After finishing the traversal, the second last element in the
//   maximum array represents the second largest value.
// - Print that value.

// Time Complexity: O(n)
// Space Complexity: O(n)

public class SecondLargest {
  public static void secLargest(int n[]) {
    int arr[] = new int[n.length];
    arr[0] = n[0];
    for (int i = 1; i < n.length; i++) {
      arr[i] = Math.max(n[i], arr[i - 1]);
    }

    System.out.println("Second largest: " + arr[n.length - 2]);
  }

  public static void main(String[] args) {
    int n[] = { 4, 2, 8, 6, 10 };
    secLargest(n);
  }
}
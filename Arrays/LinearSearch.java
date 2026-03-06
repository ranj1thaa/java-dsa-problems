// Problem: Linear Search in an Array
// Concept: Array Traversal, Sequential Search

// Description:
// Search for a given key in an array by checking each element one by one. If the element matches the key, return that the element is found. If the entire array is traversed and the key is not found, return not found.

// Example:
// Array: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
// Key: 14
// Output: Found

// Approach:
// - Traverse the array from index 0 to n-1.
// - Compare each element with the key.
// - If a match is found, return 1 (found).
// - If the loop completes without finding the key, return -1.
// - In main(), check the returned value to print "Found" or "Not Found".

// Time Complexity: O(n)
// Space Complexity: O(1)

public class LinearSearch {
  public static int linearSearchFn(int n[], int key) {
    for (int i = 0; i < n.length; i++) {
      if (n[i] == key) {
        return 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int n[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    int key = 14;
    int res = linearSearchFn(n, key);
    System.out.println((res == -1) ? "Not Found" : "Found");
  }
}

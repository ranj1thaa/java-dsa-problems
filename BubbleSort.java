// Problem: Bubble Sort
// Concept: Sorting Algorithm, Nested Loops, Swapping

// Description:
// Sort the elements of an array in ascending order using the Bubble Sort algorithm. Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

// Example:
// Input: [5, 4, 1, 3, 2]

// Output:
// 1
// 2
// 3
// 4
// 5

// Explanation:
// In each pass, the largest unsorted element "bubbles up"
// to its correct position at the end of the array.
// After every iteration, one element gets fixed at the end.

// Approach:
// - Use an outer loop to control the number of passes.
// - Use an inner loop to compare adjacent elements.
// - If the current element is greater than the next element, swap them.
// - Continue this process until the entire array is sorted.
// - Finally, print the sorted array.

// Time Complexity:
// Best Case: O(n) (when array is already sorted with optimization)
// Average Case: O(n²)
// Worst Case: O(n²)

// Space Complexity: O(1)

public class BubbleSort {
  public static void bubbleSort(int n[]) {
    for (int i = 0; i < n.length - 1; i++) {
      for (int j = 0; j < n.length - 1 - i; j++) {
        if (n[j] > n[j + 1]) {
          int t = n[j];
          n[j] = n[j + 1];
          n[j + 1] = t;
        }
      }
    }
  }

  public static void printArr(int n[]) {
    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
  }

  public static void main(String[] args) {
    int n[] = { 5, 4, 1, 3, 2 };
    bubbleSort(n);
    printArr(n);
  }
}

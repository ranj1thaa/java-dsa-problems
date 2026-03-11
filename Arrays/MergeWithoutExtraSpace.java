// Problem: Merge Two Sorted Arrays Without Extra Space
// Difficulty: Medium
// Concept: Swapping + Sorting

// Description:
// Given two sorted arrays a[] and b[], merge them without using extra space.
// After merging:
// - a[] should contain the first n smallest elements
// - b[] should contain the remaining m elements.

// Approach:
// 1. Traverse array a from the end.
// 2. Compare last element of a with first element of b.
// 3. If a[i] > b[0], swap them.
// 4. Sort array b to maintain order.
// 5. Continue for all elements of a.

import java.util.Arrays;

public class MergeWithoutExtraSpace {
  public static void printMerge(int a[], int b[]) {
    int n = a.length;
    for (int i = n - 1; i >= 0; i--) {
      if (a[i] > b[0]) {
        int temp = a[i];
        a[i] = b[0];
        b[0] = temp;

        Arrays.sort(b);
      }
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int a[] = { 2, 4, 7, 10 };
    int b[] = { 2, 3 };
    printMerge(a, b);
    printArr(a);
    printArr(b);
  }
}

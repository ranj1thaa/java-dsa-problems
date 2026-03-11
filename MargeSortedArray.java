public class MargeSortedArray {
  public static void mergeSorted(int nums1[], int nums2[], int m, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = nums1.length - 1;

    while (j >= 0) {
      if (i >= 0 && nums1[i] > nums2[j]) {
        nums1[k] = nums1[i];
        k--;
        i--;
      } else {
        nums1[k] = nums2[j];
        k--;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    int m = 3;
    int n = 3;
    mergeSorted(nums1, nums2, m, n);
    for (int i = 0; i < nums1.length; i++) {
      System.out.println(nums1[i]);
    }
  }
}

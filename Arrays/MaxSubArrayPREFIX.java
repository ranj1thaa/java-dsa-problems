public class MaxSubArrayPREFIX {
  public static void maxAubArrPREFIX(int n[]) {
    int pre[] = new int[n.length];
    int currSum = 0;
    int maxSum = 0;

    pre[0] = n[0];
    for (int i = 1; i < pre.length; i++) {
      pre[i] = pre[i - 1] + n[i];
    }

    for (int i = 0; i < n.length; i++) {
      for (int j = i; j < n.length; j++) {
        currSum = i == 0 ? pre[j] : pre[j] - pre[i - 1];
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max Sum= " + maxSum);
  }

  public static void main(String[] args) {
    int n[] = { 2, 4, 6, 8, 10 };
    maxAubArrPREFIX(n);
  }

}

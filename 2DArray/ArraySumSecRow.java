public class ArraySumSecRow {
  public static void printSum(int n[][]) {
    int sum = 0;
    for (int j = 0; j < n[0].length; j++) {
      sum += n[1][j];
    }
    System.out.println(sum);

  }

  public static void main(String[] args) {
    int n[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    printSum(n);
  }
}

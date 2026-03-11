public class PrintKeyCount {
  public static void printCount(int n[][], int key) {
    int count = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        if (n[i][j] == key) {
          count += 1;
        }
      }
    }
    System.out.println("Count of key is:" + count);
  }

  public static void main(String[] args) {
    int n[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
    printCount(n, 7);
  }
}

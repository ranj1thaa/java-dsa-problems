public class COuntEvenNOdd {

  public static void countEvenOdd(int n[]) {
    int eCount = 0;
    int oCount = 0;
    ;
    for (int i = 0; i < n.length; i++) {
      if (n[i] % 2 == 0) {
        eCount++;
      } else {
        oCount++;
      }
    }
    System.out.println("First odd: " + oCount);
    System.out.println("First Even: " + eCount);

  }

  public static void main(String[] args) {
    int n[] = { 1, 2, 3, 4, 5 };
    countEvenOdd(n);
  }
}

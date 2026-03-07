public class MovesZerostoEnd {

  public static void move(int n[]) {
    int e = 0;
    for (int i = 0; i < n.length; i++) {
      if (n[i] != 0) {
        int temp = n[i];
        n[i] = n[e];
        n[e] = temp;
        e++;

      }
    }
  }

  public static void main(String[] args) {
    int nums[] = { 0, 1, 0, 3, 12 };
    move(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}

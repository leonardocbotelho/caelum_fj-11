class Fibonacci {
  public static void main(String[] args) {
    int x = 0;
    int y = 1;
    for (x = 0;x <= 144;x = (y - x)) {
      if (x > 0) {
        System.out.print(", ");
      }
      y += x;
      System.out.print(x);
    }
    System.out.println("");
  }
}

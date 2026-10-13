package utils;

public class MathUtils {
  public static int factorial(final int n) {
    if (n == 0) return 1;
    if (n == 1) return 1;
    return n * factorial(n - 1);
  }
}

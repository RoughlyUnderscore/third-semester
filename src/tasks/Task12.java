package tasks;

import utils.MathUtils;

public class Task12 {
  public double task(final double x, final int n) {
    double result = 1 + x;

    for (int cur = 2; cur <= n; cur++) {
      result += (Math.pow(x, cur) / MathUtils.factorial(cur));
    }

    return result;
  }
}

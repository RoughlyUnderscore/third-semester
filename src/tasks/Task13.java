package tasks;

public class Task13 {
  public void task(final double epsilon) {
    double cur = epsilon;
    double sk = 0;
    double skPrev = 0;

    int k = 1;

    while (cur >= epsilon) {
      k++;
      sk = sequence(k);
      skPrev = sequence(k - 1);
      cur = Math.abs(sk - skPrev);
    }

    IO.println(String.format("%d | %f, %f", k, sk, skPrev));
  }

  private double sequence(final int k) {
    if (k == 1) return 1;
    if (k == 2) return 2;

    return (sequence(k - 2) + 2 * sequence(k - 1)) / 3.0;
  }
}

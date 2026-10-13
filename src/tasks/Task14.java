package tasks;

public class Task14 {
  public void task(final double a, final double b) {
    double min = Math.min(a, b);
    double max = Math.max(a, b);
    int c = (int) Math.ceil(max);
    int d = (int) Math.floor(min);

    IO.println(String.format("%f; %f", min, max));
    IO.println(String.format("c = %d | d = %d", c, d));
    IO.println(String.format("%d >= %f > %f >= %d", c, max, min, d));
  }
}

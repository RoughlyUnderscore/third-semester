package tasks;

public class Task11 {
  public void task() {
    for (int x = 0; x <= 90; x += 5) {
      IO.println(String.format("sin(%d) = %f", x, Math.sin(Math.toRadians(x))));
    }
  }
}

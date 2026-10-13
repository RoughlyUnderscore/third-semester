package tasks;

public class Task21 {
  public void task(final int[] array) {
    for (int i = 0; i < array.length; i += 2) {
      IO.println(array[i]);
    }

    for (int i = 1; i < array.length; i += 2) {
      IO.println(array[i]);
    }
  }
}

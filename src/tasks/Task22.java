package tasks;

public class Task22 {
  public int task(final int[] sortedArray) {
    if (sortedArray.length == 0) return 0;

    int distinct = 1;
    for (int idx = 1; idx < sortedArray.length; idx++) {
      final int cur = sortedArray[idx];
      final int prev = sortedArray[idx - 1];
      if (cur - prev != 0) distinct++;
    }

    return distinct;
  }
}

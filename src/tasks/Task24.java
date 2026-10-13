package tasks;

public class Task24 {
  public int[][] task(int m, int n) {
    int[][] result = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        result[i][j] = (j + 1) * 5;
      }
    }

    return result;
  }
}

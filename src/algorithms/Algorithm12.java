package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Нормированная температура
 * После нормализации температуры лежат в [0, 1). Нужно разложить измерения по диапазонам,
 * отсортировать внутри каждого диапазона и соединить диапазоны.
 * Задание: выберите подходящий метод сортировки по ограничениям задачи и реализуйте его
 * для описанных данных. Проверьте корректность и укажите сложность алгоритма.
 * Примеры тестовых данных:
 *     Вход: [0.15, 0.75, 0.40, 0.05]; ожидаемый результат: [0.05, 0.15, 0.40, 0.75].
 *     Вход: [0.60, 0.01, 0.61]; ожидаемый результат: [0.01, 0.60, 0.61].
 */
public class Algorithm12 {
  /**
   * Bucket Sort
   * Time: O(n logn) - если все значения попадают в один бакет; ожидается O(n)
   */
  public double[] sort(final double[] input) {
    int n = input.length;
    List<List<Double>> buckets = new ArrayList<>(n);

    for (int i = 0; i < n; i++) {
      buckets.add(new ArrayList<>());
    }

    for (final double value : input) {
      int idx = (int) (value * n);
      buckets.get(idx).add(value);
    }

    double[] result = new double[n];
    int cur = 0;

    for (final List<Double> bucket : buckets) {
      Collections.sort(bucket);

      for (final double value : bucket) {
        result[cur++] = value;
      }
    }

    return result;
  }

  public void test() {
    final double[] result1 = sort(new double[] { 0.15, 0.75, 0.40, 0.05 });
    final double[] result2 = sort(new double[] { 0.60, 0.01, 0.61 });

    if (!Arrays.equals(result1, new double[] { 0.05, 0.15, 0.40, 0.75 })) {
      throw new IllegalStateException("Test 1 failed");
    }

    if (!Arrays.equals(result2, new double[] { 0.01, 0.60, 0.61 })) {
      throw new IllegalStateException("Test 2 failed");
    }
  }
}

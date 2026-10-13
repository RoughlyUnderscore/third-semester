package algorithms;

import java.util.Arrays;

/**
 * Номера посылок
 * Номера посылок — неотрицательные целые числа длиной не более 8 цифр.
 * Возможных номеров очень много, поэтому массив на весь диапазон создавать нельзя.
 * Задание: выберите подходящий метод сортировки по ограничениям задачи и реализуйте
 * его для описанных данных. Проверьте корректность и укажите сложность алгоритма.
 * Примеры тестовых данных:
 *     Вход: [329, 457, 657, 839]; ожидаемый результат: [329, 457, 657, 839].
 *     Вход: [21, 4, 105, 33]; ожидаемый результат: [4, 21, 33, 105].
 */
public class Algorithm13 {
  /**
   * Radix (LSD) sort
   * Time: O(n * (k+j)); n - макс. количество цифр, k - длина массива, j = 10 (десятеричная система)
   */
  public int[] sort(final int[] input) {
    int[] result = input.clone();

    int max = 0;
    for (final int value : input) {
      max = Math.max(value, max);
    }

    for (int exp = 1; max / exp > 0; exp *= 10) {
      subsort(result, exp);
    }

    return result;
  }

  private void subsort(final int[] array, int exp) {
    int n = array.length;

    int[] out = new int[n];
    int[] count = new int[10];

    for (final int value : array) {
      final int digit = (value / exp) % 10;
      count[digit]++;
    }

    for (int i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }

    for (int i = n - 1; i >= 0; i --) {
      final int digit = (array[i] / exp) % 10;
      out[--count[digit]] = array[i];
    }

    System.arraycopy(out, 0, array, 0, n);
  }

  public void test() {
    final int[] result1 = sort(new int[] { 329, 457, 657, 839 });
    final int[] result2 = sort(new int[] { 21, 4, 105, 33 });

    if (!Arrays.equals(result1, new int[] { 329, 457, 657, 839 })) {
      throw new IllegalStateException("Test 1 failed");
    }

    if (!Arrays.equals(result2, new int[] { 4, 21, 33, 105 })) {
      throw new IllegalStateException("Test 2 failed");
    }
  }
}

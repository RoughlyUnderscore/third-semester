package algorithms;

import java.util.Arrays;

/**
 * Возраст посетителей
 * Для статистики музея нужно вывести возраста посетителей по возрастанию.
 * Возраст — целое число от 0 до 120, количество посетителей — несколько миллионов.
 * Задание: выберите подходящий метод сортировки по ограничениям задачи и реализуйте
 * его для описанных данных. Проверьте корректность и укажите сложность алгоритма.
 * Примеры тестовых данных:
 *     Вход: [18, 65, 4, 65, 32]; ожидаемый результат: [4, 18, 32, 65, 65].
 *     Вход: [0, 120, 7, 7]; ожидаемый результат: [0, 7, 7, 120].
 */
public class Algorithm11 {
  /**
   * Counting Sort
   * Time: O(n + k); n - размер массива, k - длина диапазона возраста
   */
  public int[] sort(final int[] input) {
    int[] counts = new int[121]; // вместо константы можно взять (max - min + 1)
    Arrays.fill(counts, 0);

    for (int value : input) {
      counts[value]++;
    }

    int[] result = new int[input.length];
    int idx = 0;

    for (int age = 0; age <= 120; age++) {
      for (int j = 0; j < counts[age]; j++) {
        result[idx++] = age;
      }
    }

    return result;
  }

  public void test() {
    final int[] result1 = sort(new int[] { 18, 65, 4, 65, 32 });
    final int[] result2 = sort(new int[] { 0, 120, 7, 7 });

    if (!Arrays.equals(result1, new int[] { 4, 18, 32, 65, 65 })) {
      throw new IllegalStateException("Test 1 failed");
    }

    if (!Arrays.equals(result2, new int[] { 0, 7, 7, 120 })) {
      throw new IllegalStateException("Test 2 failed");
    }
  }
}

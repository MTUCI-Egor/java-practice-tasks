package lesson03.part01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Вводить с клавиатуры числа и вычислить среднее арифметическое. Если пользователь ввел -1, вывести на экран среднее
 * арифметическое всех чисел и завершить программу. -1 не должно учитываться.
 * <p>
 * Примеры: а) при вводе чисел 1 2 2 4 5 -1 получим вывод 2.8
 * <p>
 * б) при вводе чисел 4 3 2 1 -1 получим вывод 2.5
 * <p>
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 * <p>
 * while (true) { int number = считываем число; if (проверяем, что number -1) break; }
 * <p>
 * Требования: 1.	Программа должна считывать данные с клавиатуры. 2.	Программа должна выводить данные на экран. 3.	После
 * ввода -1 программа должна корректно завершить работу. 4.	Если последовательно ввести: 1, 2, 2, 4, 5 и -1, программа
 * должна вывести 2.8. 5.	Если последовательно ввести: -100, 0, 100 и -1, программа должна вывести 0.0. 6.	Если
 * последовательно ввести: 1 и -1, программа должна вывести 1.0. 7.	Выведенный результат должен соответствовать заданию
 * для любых входных данных.
 */

public class Task06 {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    float sum = 0;
    float kol = 0;
    while (true) {
      int number = Integer.parseInt(reader.readLine());
      if (number == -1) {
        break;
      }
      sum += number;
      kol++;
    }
    float sr = sum / kol;
    System.out.println(sr);
  }

}
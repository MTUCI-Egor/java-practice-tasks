package lesson02.part01;

/**
 * Расставить правильно (по другому) скобки, чтобы на экран вывелось число 382
 * <p>
 * <p>
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	Метод main должен содержать только один вызов System.out.println.
 * 3.	Последовательность цифр и арифметических операций изменять нельзя.
 * 4.	Количество круглых скобок должно остаться прежним (2 открывающие и 2 закрывающие).
 * 5.	Метод main должен выводить на экран число 382.
 */

public class Task06 {
    public static void main(String[] args) {
        System.out.println((2 * (3 + 4 * (5 + 6 * 7))));
    }
}

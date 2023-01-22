package Seminar_03.Task3;

public class GenericTest {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 является делителем 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 не является делителем 10");
        }
        System.out.println(" ");

        SomeTest<Double> isFactorDouble = (n, m) -> (n < m);

        if (isFactorDouble.test(2.2, 10.1)) {
            System.out.println("2 < 10");
        }
        if (!isFactorDouble.test(10.1, 2.2)) {
            System.out.println("10 не < 2");
        }
        System.out.println();

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "Обобщённый функциональный интерфейс";
        System.out.println("Тестируемая строка: " + str);
        if (isIn.test(str, "Слово")) {
            System.out.println("Найдено!");
        } else {
            System.out.println("Не найдено");
        }
    }
}

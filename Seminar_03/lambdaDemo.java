package Seminar_03;

public class lambdaDemo {
    public static void main(String[] args) {
        numericTest isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("2 является делителем 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 не является делителем 10");
        }
        System.out.println();
        numericTest isFactor2 = (n, m) -> (n < m);
        if (isFactor2.test(2, 10)) {
            System.out.println("2 < 10");
        }
        if (!isFactor2.test(10, 2)) {
            System.out.println("10 не < 2");
        }
        System.out.println();
        numericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if (absEqual.test(4, -4)) {
            System.out.println("4 = |-4|");
        }
        if (!absEqual.test(4, -5)) {
            System.out.println("4 != |-5|");
        }
    }
}

package Seminar_02;

public class Main {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + ob.getNext());
        }
        System.out.println("Сброс");
        ob.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + ob.getNext());
        }
        System.out.println("Начальное значение = 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + ob.getNext());
        }
    }
}

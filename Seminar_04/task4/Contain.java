package Seminar_04.task4;

public interface Contain<T> {
    boolean contains(T o);
}

class Gen4<T> implements Contain<T> {

    T[] arr;

    Gen4(T[] o) {
        arr = o;

    }

    @Override
    public boolean contains(T o) {
        for (T x : arr) {
            if (x.equals(o)) {
                return true;
            }
        }
        return false;
    }

}

class Gen5 {
    public static void main(String[] args) {
        Integer[] x = { 1, 2, 3 };

        Gen4<Integer> ob = new Gen4<>(x);

        if (ob.contains(2)) {
            System.out.println("2 содержится в ob");
        } else {
            System.out.println("2 НЕ содержится в ob");
        }

        if (ob.contains(5)) {
            System.out.println("5 содержится в ob");
        } else {
            System.out.println("5 НЕ содержится в ob");
        }
    }
}

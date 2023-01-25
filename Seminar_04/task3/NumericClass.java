package Seminar_04.task3;

public class NumericClass<T extends Number> {

    T Tnum;

    NumericClass(T n) {
        Tnum = n;
    }

    double getRec() {
        return 1 / Tnum.doubleValue();
    }

    double getFrac() {
        return Tnum.doubleValue() - Tnum.intValue();
    }

    boolean absEqual(NumericClass<?> ob) {
        // Проверить равенство абсолютных значений
        if (Math.abs(Tnum.doubleValue()) == Math.abs(ob.Tnum.doubleValue())) {
            return true;
        } else {
            return false;
        }
    }
}

class Gen3 {
    public static void main(String[] args) {

        NumericClass<Integer> iOb = new NumericClass<>(6);

        // System.out.println("Обратная величина iob равна: " + iOb.getRec());
        // System.out.println("Дробная часть: " + iOb.getFrac());

        // System.out.println("-------------");

        NumericClass<Double> dOb = new NumericClass<Double>(-6.0);

        // System.out.println("Обратная величина dob равна: " + dOb.getRec());
        // System.out.println("Дробная часть: " + dOb.getFrac());

        // System.out.println("-------------");

        NumericClass<Long> lOb;
        lOb = new NumericClass<Long>(5L);

        System.out.println("iOb and dOb: " + iOb.absEqual(dOb));
        System.out.println("iOb and lOb: " + iOb.absEqual(lOb));

    }
}
package Seminar_04.task3;

public class NumericClass<T extends Number> {
    
    T Tnum;

    NumericClass(T n){
        Tnum = n;
    }

    double getRec(){
        return 1/Tnum.doubleValue();
    }

    double getFrac(){
        return Tnum.doubleValue() - Tnum.intValue();
    }
}

class Gen3{
    public static void main(String[] args) {

        NumericClass<Integer> iOb = new NumericClass<>(5);

        System.out.println("Обратная величина iob равна: " + iOb.getRec());
        System.out.println("Дробная часть: " + iOb.getFrac());

        System.out.println("-------------");

        NumericClass<Double> dOb = new NumericClass<Double>(5.25);

        System.out.println("Обратная величина dob равна: " + dOb.getRec());
        System.out.println("Дробная часть: " + dOb.getFrac());
        
        System.out.println("-------------");

    }
}
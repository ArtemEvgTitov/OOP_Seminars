package Seminar_04.task1;

public class Gen<T> {

    T ob; // Объявить объект типа Т

    Gen(T o) { // Передать конструктору объект типа Т
        ob = o;
    }

    T getOb() { // Вернуть объект ob из метода
        return ob;
    }

    void showType() { // Отобразить тип Т
        System.out.println("Тип Т это: " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb; // Создаём ссылку на объект типа Integer
        iOb = new Gen<Integer>(88); // Создание экземпляра типа Integer

        iOb.showType(); // Отобразить тип данных iOb

        int v = iOb.getOb(); // Присвоили примитиву значение объекта iOb
        System.out.println("Значение: " + v);
        
        System.out.println("-------------");

        Gen<String> str = new Gen<String>("Test");
        str.showType();
        String str1 = str.getOb();
        System.out.println("Значение: " + str1);
    }
}
package Seminar_01_2;


class TwoShape {
    double height;
    double weidht;

    public void showInfo() {
        System.out.println("height: " + height);
        System.out.println("weidht: " + weidht);
    }
}

class Triangle extends TwoShape
{
    String style;

    double area(){
        return height*weidht/2;
    };

    void showStyle() {
        System.out.println("Triangle: " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.style = "Закрашенный";
        t1.height = 4.0;
        t1.weidht = 2.5;

        t2.style = "Пустой";
        t2.height = 5.0;
        t2.weidht = 1.0;

        System.out.println("Инфо t1");
        t1.showStyle();
        t1.showInfo();
        System.out.println("Площадь t1:" + t1.area());

        System.out.println("--------------");

        System.out.println("Инфо t2");
        t2.showStyle();
        t2.showInfo();
        System.out.println("Площадь t2:" + t2.area());
    }
}
package Seminar_01_2;

class TwoShape {
    private double height;
    private double widht;

    public double getHeight() {
        return height;
    }

    public double getWidht() {
        return widht;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public void showInfo() {
        System.out.println("height: " + height);
        System.out.println("widht: " + widht);

    }
}

class Triangle extends TwoShape { 
    private String style;

    Triangle(String s, double h, double w){
        setStyle(s);
        setHeight(h);
        setWidht(w);
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    double area() {
        return getHeight() * getWidht() / 2;
    };

    void showStyle() {
        System.out.println("Triangle: " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Закрашенный", 4.0, 2.5);
        Triangle t2 = new Triangle("Пустой", 5.0, 1.0);

        // t1.setStyle("Закрашенный");
        // t1.setHeight(4.0);
        // t1.setWidht(2.5);

        // t2.setStyle("Пустой");
        // t2.setHeight(5.0);
        // t2.setWidht(1.0);

        System.out.println("Инфо t1");
        t1.showStyle();
        t1.showInfo();
        System.out.println("Площадь t1: " + t1.area());

        System.out.println("--------------");

        System.out.println("Инфо t2");
        t2.showStyle();
        t2.showInfo();
        System.out.println("Площадь t2: " + t2.area());
    }
}
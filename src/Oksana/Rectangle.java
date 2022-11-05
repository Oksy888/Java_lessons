package Oksana;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(10, 20);
    }

    double area() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(15, 22);
        System.out.println(rect.area());
    }

}

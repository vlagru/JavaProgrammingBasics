package vlagru.rectangle;

public class MainRectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Rectangle rectangle1 = new Rectangle(80);
        Rectangle rectangle2 = new Rectangle();
        System.out.println("a = " + rectangle.getB() + ", b = " + rectangle.getB());
        System.out.println(rectangle.toString());
        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}

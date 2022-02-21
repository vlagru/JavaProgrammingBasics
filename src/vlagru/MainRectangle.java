package vlagru;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 8);
        System.out.println(rectangle);
        rectangle.setHeight(3);
        rectangle.setWidth(8);
        System.out.println(rectangle);
        rectangle.setHeight(-3);
        rectangle.setWidth(-8);
        System.out.println(rectangle);
    }
}

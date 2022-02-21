package vlagru;

public class OOPRectangleMain {
    public static void main(String[] args) {
        OOPRectangle rectangle = new OOPRectangle(6, 8);
        System.out.println(rectangle);
        rectangle.setHeight(3);
        rectangle.setWidth(8);
        System.out.println(rectangle);
        rectangle.setHeight(-3);
        rectangle.setWidth(-8);
        System.out.println(rectangle);
    }
}

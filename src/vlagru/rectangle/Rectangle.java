package vlagru.rectangle;

public class Rectangle {
    private int a;
    private int b;
    public static final int DEFAULT_SIZE = 1; // proc je zde static?

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int d) {
        this.a = d;
        this.b = d;
    }

    public Rectangle() {
        this.a = DEFAULT_SIZE;
        this.b = DEFAULT_SIZE;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

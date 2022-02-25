package vlagru.practice;

public class OOPRectangle {
    private int height;
    private int width;

    public OOPRectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height >= 0)  {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Musite zadat kladne cislo.");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width >= 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Musite zadat kladne cislo.");
        }
    }
}

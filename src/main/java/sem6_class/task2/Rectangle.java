package sem6_class.task2;

public class Rectangle {
    protected int width;
    protected int height;

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}




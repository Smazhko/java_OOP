package sem6_class.task5;

class RectangleNew {
    protected int width;
    protected int height;

    public RectangleNew(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

//***********************************************************
class SquareNew {
    private RectangleNew rectangle;

    public SquareNew(int size) {
        this.rectangle = new RectangleNew(size, size);
    }

    public void setSize(int size) {
        rectangle.setWidth(size);
        rectangle.setHeight(size);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}

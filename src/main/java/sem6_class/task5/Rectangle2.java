package sem6_class.task5;

class Rectangle1 {
    protected int width;
    protected int height;

    public Rectangle1(int width, int height) {
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

class Square1 {
    private Rectangle1 rectangle;

    public Square1(int size) {
        this.rectangle = new Rectangle1(size, size);
    }

    public void setSize(int size) {
        rectangle.setWidth(size);
        rectangle.setHeight(size);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}

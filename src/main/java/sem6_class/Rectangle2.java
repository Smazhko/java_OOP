package sem6_class;

class Rectangle {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
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

class Square {
    private Rectangle rectangle;

    public Square(int size) {
        this.rectangle = new Rectangle(size, size);
    }

    public void setSize(int size) {
        rectangle.setWidth(size);
        rectangle.setHeight(size);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}

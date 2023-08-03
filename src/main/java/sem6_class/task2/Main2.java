package sem6_class.task2;

class Rectangle {
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



class Square extends Rectangle {
    @Override
    public void setDimensions(int width, int height) {
        // Предположим, что у нас есть такое ограничение:
        // В квадрате ширина и высота всегда равны
        int size = Math.max(width, height);
        this.width = size;
        this.height = size;
    }
}

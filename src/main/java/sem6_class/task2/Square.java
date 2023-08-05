package sem6_class.task2;

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

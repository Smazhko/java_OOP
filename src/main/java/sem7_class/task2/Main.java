package sem7_class.task2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory squareFactory = new SquareFactory();

        Shape circle = circleFactory.createShape();
        Shape square = squareFactory.createShape();

        circle.draw(); // Выведет: Drawing a circle
        square.draw(); // Выведет: Drawing a square
    }
}
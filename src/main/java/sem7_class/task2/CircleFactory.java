package sem7_class.task2;

class CircleFactory implements ShapeFactory {
    private final CircleFactory circleFactory = new CircleFactory();

    @Override
    public Shape createShape() {
        return circleFactory.createShape();
    }
}
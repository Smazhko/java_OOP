package sem6_class.task3;

interface Shape {
    double getArea();
    double getPerimeter();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

//    Принцип инверсии зависимостей
//        - модули высокого уровня не должны зависеть
//        от модулей нижнего уровня.
//        И те, и другие должны зависеть от абстракций.
//        - абстракции не должны зависеть от деталей.
//        Детали должны зависеть от абстракций.

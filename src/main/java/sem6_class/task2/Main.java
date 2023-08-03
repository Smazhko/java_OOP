package sem6_class.task2;

import java.util.*;

class Shape {
    // Общие свойства и методы для всех фигур
    // ...

    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // Конструктор, геттеры и сеттеры
    // ...

    @Override
    public double getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private double side;

    // Конструктор, геттеры и сеттеры
    // ...

    @Override
    public double getArea() {
        return side * side;
    }
}

class Circle extends Shape {
    private double radius;

    // Конструктор, геттеры и сеттеры
    // ...

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Создаем объекты различных фигур и добавляем их в ArrayList
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);
        Shape circle = new Circle(3);

        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(circle);

        // Выводим площадь каждой фигуры
        for (Shape shape : shapes) {
            printArea(shape);
        }
    }

    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
}
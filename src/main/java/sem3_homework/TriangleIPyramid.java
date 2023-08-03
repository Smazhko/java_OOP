package sem3_homework;

public class TriangleIPyramid implements IPyramid, IFigure3D {

    private Triangle baseTriangle;
    private double height;
    private int heightAngle;

    public TriangleIPyramid(Triangle baseTriangle, double height, int heightAngle) {
        this.baseTriangle = baseTriangle;
        this.height = height;
        this.heightAngle = heightAngle;
    }

    public TriangleIPyramid() {
        this(new Triangle(10), 10, 90);
    }

    @Override
    public double calcBottomBasePerimeter() {
        return 123.45;
    }

    @Override
    public double calcBottomBaseArea() {
        return 12.34;
    }

    @Override
    public double calcArea() {
        return 123.45;
    }

    @Override
    public double calcPerimeter() {
        return 1234.56;
    }

    @Override
    public String showCalcs() {
        return String.format("Доп параметры: %n" +
                "Основание: периметр = %.1f, площадь = %.1f, %n" +
                "площадь пирамиды = %.1, её периметр = %.1f, объём = %.1f");
    }

    @Override
    public double calcVolume() {
        return 0;
    }
}

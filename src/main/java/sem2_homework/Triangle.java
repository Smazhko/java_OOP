package sem2_homework;

public class Triangle implements IFigure2D, ITriangle {

    private double sideAB;
    private double sideBC;
    private double sideAC;
    public static int counter = 0;
    private TriangleType type;
    private boolean isIsosceles;


    public enum TriangleType {
        VERSATILE,      // разносторонний
        EQUILATERAL,    // равносторонний
        RECTANGULAR;    // прямоугольный
    }


    public Triangle(double sideAB, double sideBC, double sideAC) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideAC = sideAC;
        counter++;
        type = findType();
        isIsosceles = (sideAB == sideBC || sideAB == sideAC);
    }

    public Triangle(double sideAB, double sideAC) {
        this(sideAB, sideAB, sideAC);
    }

    public Triangle(double sideAB) {
        this(sideAB, sideAB, sideAB);
        type = TriangleType.EQUILATERAL;
    }

    public Triangle(){
        this(10);
    }

    @Override
    public double calcArea() {
        double perimeter = calcPerimeter();
        return Math.sqrt(perimeter * (perimeter - sideAB) * (perimeter - sideBC) * (perimeter - sideAC));
    }

    @Override
    public double calcPerimeter() {
        return sideAB + sideBC + sideAC;
    }

    public double calcHeight(){
        return 2 * calcArea() / sideAB;
    }

    private TriangleType findType(){
        double hypotenuse;
        double leg1; // катет
        double leg2;   // катет

        hypotenuse = Math.max(Math.max(sideAB, sideBC), Math.max(sideBC, sideAC));
        if(sideAB == hypotenuse) {leg1 = sideBC; leg2 = sideAC;}
        else if(sideBC == hypotenuse) {leg1 = sideAB; leg2 = sideAC;}
        else {leg1 = sideAB; leg2 = sideBC;}

        if (hypotenuse*hypotenuse == leg1*leg1 + leg2*leg2) {
            type = TriangleType.RECTANGULAR;
        } else if (sideAB == sideBC && sideAB == sideAC) {
            type = TriangleType.EQUILATERAL;
        } else {
            type = TriangleType.VERSATILE;
        }
        return type;
    }

    public String toString() {
        String isosceles = (isIsosceles ? "(равнобедренный) " : "");
        return switch (type) {
            case VERSATILE, RECTANGULAR ->
                    String.format("Треугольник Δ ABC #%d %s %sсо сторонами: AB = %.1f, BC = %.1f и АС = %.1f.%n",
                            counter, getType(), isosceles, sideAB, sideBC, sideAC);
            case EQUILATERAL ->
                    String.format("Треугольник Δ ABC #%d %s со стороной: AB = BC = AC = %.1f. %n",
                            counter, getType(), sideAB);
        };
    }

    public String showCalcs(){
        return String.format("Доп параметры: высота = %.1f, периметр = %.1f, площадь = %.1f.%n",
                calcHeight(), calcPerimeter(), calcArea());
    }
    
    public String getType(){
        return switch (type) {
            case VERSATILE ->
                    "РАЗНОСТОРОННИЙ";
            case RECTANGULAR ->
                    "ПРЯМОУГОЛЬНЫЙ";
            case EQUILATERAL ->
                    "РАВНОСТОРОННИЙ";
        };
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public double getSideAC() {
        return sideAC;
    }

}

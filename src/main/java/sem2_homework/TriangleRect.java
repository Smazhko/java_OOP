package sem2_homework;

public class TriangleRect extends Triangle{

    TriangleType type = TriangleType.RECTANGULAR;


    public TriangleRect(double leg1, double leg2, double hypotenuse) {
        super(leg1, leg2, hypotenuse);
    }

    public TriangleRect(double leg1, double leg2) {
        super(leg1, leg2, Math.sqrt(leg1*leg1 + leg2*leg2));
    }

    public TriangleRect(){
        this(3,4,5);
    }

    @Override
    public double calcArea() {
        return getSideAB() * getSideBC() / 2;
    }



    public double getHypotenuse() {
        return getSideAC();
    }

    public double getLeg1() {
        return getSideAB();
    }

    public double getLeg2() {
        return getSideBC();
    }
}


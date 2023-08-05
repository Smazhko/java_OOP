package sem4_class.task2;

public class NumericDemo {
    public static void main(String[] args) {
        Numeric<Integer> iOb = new Numeric<>(5);
        System.out.println("Обратная величина iOb " + iOb.reciprocal());
        System.out.println("Дробная часть iOb " + iOb.fract());
        System.out.println(" ");

        Numeric<Double> dOb = new Numeric<>(5.25);
        System.out.println("Обратная величина dOb " + dOb.reciprocal());
        System.out.println("Дробная часть dOb " + dOb.fract());

//        Numeric<String> sOb = new Numeric<>("5");
    }
}

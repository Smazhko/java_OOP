package sem5_class;

public class CalcModel {         // Логика программы

    /**
     *
     * @param value1 первое слагаемое
     * @param value2 второе слагаемое
     * @return сумма двух чисел
     */

    public int sum(int value1, int value2) {
        return value1 + value2;
    }

    public int div(int value1, int value2) {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
    }

    public int mul(int value1, int value2) {
        return value1 * value2;
    }

    public int sub(int value1, int value2) {
        return value1 - value2;
    }

}

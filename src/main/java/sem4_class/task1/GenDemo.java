package sem4_class.task1;

public class GenDemo {
    public static void main(String[] args) {
        Generics<Integer> integerGen;
        integerGen = new Generics<Integer>(88);

        integerGen.showType();

        int val1 = integerGen.getObj();

        System.out.println("значение val1 = " + val1);
        System.out.println();

        Generics<String> stringGen;
        stringGen = new Generics<String>("какое-то слово");

        stringGen.showType();

        String val2 = stringGen.getObj();

        System.out.println("значение val = " + val2);


    }
}

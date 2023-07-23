import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TEMP {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,10,22,14));

        System.out.println("СПИСОК: " + numList);

        Iterator<Integer> iterNumList = numList.listIterator();

        System.out.println("ИТЕРАТОР: "+iterNumList);

        numList.sort(Integer::compareTo);
        System.out.println("СОРТИРОВКА");

        while (iterNumList.hasNext()){

            System.out.println(iterNumList.next());
        }

        System.out.println("СПИСОК: "+numList);


    }
}

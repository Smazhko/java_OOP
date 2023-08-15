package sem6_homework;

import java.util.ArrayList;
import java.util.List;

public abstract class Shelf<E extends Publication> implements IShelf<E> {

    private List<E> catalog;

    protected Shelf() {
        this.catalog = new ArrayList<>();
    }

    public List<E> getCatalog() {
        return catalog;
    }

    public void add(E newItem) {
        catalog.add(newItem);
    }

    public void remove(E itemToRemove) {
        System.out.print("-".repeat(40) + "\nУдаление издания \"" + itemToRemove.getTitle() + "\": ");
        if (catalog.contains(itemToRemove)) {
            catalog.remove(itemToRemove);
            System.out.println("успешно!");
        }
        else {
            System.out.println("каталог не содержит данного издания. Удалять нечего!");
        }
    }
}

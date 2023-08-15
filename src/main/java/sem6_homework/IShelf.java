package sem6_homework;

public interface IShelf<E> {

    void add(E newItem);

    void remove(E itemToRemove);

    void displayAvailable();

    void displayAll();

    void search(String searchPhrase);

}

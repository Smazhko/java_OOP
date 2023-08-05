package sem4_class.task1;

public class Generics<T> {
    private T obj; // объявить объёкт типа Т

    public Generics(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showType(){
        System.out.println("Тип Т - " + obj.getClass().getSimpleName());
    }
}

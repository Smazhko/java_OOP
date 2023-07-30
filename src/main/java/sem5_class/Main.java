package sem5_class;

public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcController controller = new CalcController(model, view);
        controller.select();
    }
}


/*
ПОЛЕЗНОЕ

https://www.youtube.com/watch?v=_uZQtRyF6Eg
 */
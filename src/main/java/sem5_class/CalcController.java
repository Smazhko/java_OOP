package sem5_class;

public class CalcController { // Связывает модели представления, обрабатывая ввод пользователя

    private CalcModel model = new CalcModel();
    private CalcView view = new CalcView();

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void select() {
        int num1 = view.userInput();
        int num2 = view.userInput();
        char ch = view.chooseOperation();
        int result = 0;
        switch (ch) {
            case '+':
                result = model.sum(num1, num2);
                break;
            case '-':
                result = model.sub(num1, num2);
                break;
            case '/':
                result = model.div(num1, num2);
                break;
            case '*':
                result = model.mul(num1, num2);
                break;
            default:
                System.out.println("Введена неверная операция");
                break;

        }
        view.showOutput(result);
    }
}


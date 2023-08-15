package sem5_class;

public class CalcController { // Связывает модель и представление, обрабатывая ввод пользователя

    private final CalcModel model;
    private final CalcView view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void select() {
        boolean continueFlag = true;
        while (continueFlag) {
            int num1 = view.userInput();
            char ch = view.chooseOperation();
            int num2 = view.userInput();
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
                case 'Q', 'q', 'Й', 'й':
                    continueFlag = false;
                    break;
                default:
                    System.out.println("Введена неверная операция");
                    break;
            }
            view.showOutput(result);
        }
    }
}


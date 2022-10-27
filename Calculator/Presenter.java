package Home_Tasks.HT_10.Calculator;

public class Presenter {

    private final CalculateModel model;

    private final View view;

    public Presenter(CalculateModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void getNum(){
        model.setFirst(view.getValue("Введите первое число "));
        model.setSecond(view.getValue("Введите второе число "));
    }
    public void summing() {
        getNum();
        view.print("Результат -  " + model.getSum());
    }
    public void dividing() {
        getNum();
        view.print("Результат - " + model.getDiv());
    }

    public void multiply() {
        getNum();
        view.print("Результат - " + model.getMulti());
    }

    public void minus() {
        getNum();
        view.print("Результат - " + model.getMinus());
    }
    /**
     * Заглушка для тестирования класса View совместно с SumModel
     */
    private static class MockView implements View {

        private int count = 0;

        @Override
        public int getValue(String message) {
            count++;
            return 1;
        }

        @Override
        public void print(String message) {
            if (!message.equals("Результат -  2")) {
                throw new AssertionError("Incorrect sum");
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        CalculateModel calculateModel = new CalculateModel();
        MockView mockView = new MockView();
        Presenter presenter = new Presenter(calculateModel, mockView);

        presenter.summing();
        if (mockView.getCount() != 2) {
            throw new AssertionError("Incorrect call of getValue()");
        }
    }
}

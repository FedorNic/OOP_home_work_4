package Home_Tasks.HT_10.Calculator;

public class CalculateModel {

    private int first;

    private int second;

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSum() {
        return first + second;
    }

    public double getDiv() {return first*1.0 / second;}

    public int getMinus() {
        return first - second;
    }

    public int getMulti() {return first * second;}


    public static void main(String[] args) {
        CalculateModel calculateModel = new CalculateModel();

        calculateModel.setFirst(1);
        calculateModel.setSecond(1);
        if (calculateModel.getSum() != 2) {
            throw new AssertionError("Incorrect test Sum result");
        }

        calculateModel.setFirst(4);
        calculateModel.setSecond(2);
        if (calculateModel.getDiv() != 2.0) {
            throw new AssertionError("Incorrect test Div result");
        }

        calculateModel.setFirst(3);
        calculateModel.setSecond(2);
        if (calculateModel.getMinus() != 1) {
            throw new AssertionError("Incorrect test Minus result");
        }
        calculateModel.setFirst(3);
        calculateModel.setSecond(2);
        if (calculateModel.getMulti() != 6) {
            throw new AssertionError("Incorrect test Multi result");
        }

    }
}

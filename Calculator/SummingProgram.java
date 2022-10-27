package Home_Tasks.HT_10.Calculator;

import java.util.Scanner;

public class SummingProgram {

    static Scanner scn;
    static View view;
    static CalculateModel calculateModel;
    static Presenter presenter;

    static {
        scn = new Scanner(System.in);
        view = new ViewImpl(scn, System.out);
        calculateModel = new CalculateModel();
        presenter = new Presenter(calculateModel, view);
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в тестовый калькулятор GeekBrains!");
        System.out.println("Если Вы хотите выполнить сложение двух чисел – введите «1»");
        System.out.println("Если Вы хотите выполнить вычитание двух чисел – введите «2»");
        System.out.println("Если Вы хотите выполнить умножение двух чисел – введите «3»");
        System.out.println("Если Вы хотите выполнить деление двух чисел – введите «4»");
        System.out.println("Завершить программу – введите «0»");

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case (1) -> {
                presenter.summing();
                scn.close();
            }
            case (2) -> {
                presenter.minus();
                scn.close();
            }
            case (3) -> {
                presenter.multiply();
                scn.close();
            }
            case (4) -> {
                presenter.dividing();
                scn.close();
            }
            case (0) -> {
                System.out.println("Программа завершена.");
            }
            default -> System.out.println("Введено неправильное значение");
        }
        scanner.close();
    }
}


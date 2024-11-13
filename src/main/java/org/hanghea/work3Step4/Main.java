package org.hanghea.work3Step4;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(new AddOperation());
        calc.calculate(10,20);

        Calculator calc2 = new Calculator(new DivideOperation());
        calc2.calculate(10,20);


    }
}

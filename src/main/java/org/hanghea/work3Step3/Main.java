package org.hanghea.work3Step3;


public class Main {
    public static void main(String[] args) {



        //객체 생성
        Calculator calc = new Calculator(new AddOperation(), new SubstractOperation(), new MultiplyOperation(), new DivideOperation());
        System.out.println(calc.calculate("/", 10, 5));

        

    }
}

package org.hanghea.work3;

public class Calculator {




    double calculate(String operator, int firstNumber, int secondNumber) {

        double result = 0;



        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;

                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = (double) firstNumber / secondNumber;
                break;

            case "%":
                result = firstNumber % secondNumber;
                break;

        }


        System.out.println(firstNumber +" "+operator+" "+secondNumber+" ="+ result);

        return result;
    }




}

package org.hanghea.work3Step3;

public class Calculator {



    //이 클래스에서만 사용할 수 있도록 선언
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;


    //생성자로 클래스 가져오기
    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this. multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;

    }

    public double calculate(String operator, int firstNumber, int secondNumber) {
        double result = 0;

        if(operator.equals("+")){
            result = addOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("-")){
            result = substractOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("*")){
            result = multiplyOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("/")) {
            result = divideOperation.operate(firstNumber, secondNumber);
        }
        return result;
    }



}

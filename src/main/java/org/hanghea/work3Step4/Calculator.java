package org.hanghea.work3Step4;

public class Calculator {

    //추상클래스 가져오기
    //다 가져올 필요없이 얘만 가져오면 된다.
    private AbstractOperation operation;


    //생성자
    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }



    //+,-,*,/를 바꾸기 위해 setOperation 해준다.
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int val1, int val2) {
        double result = 0;
        result = operation.operate(val1, val2);

        System.out.println("계산  : "+result);

        return result;
    }





}

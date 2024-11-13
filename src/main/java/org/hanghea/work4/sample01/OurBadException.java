package org.hanghea.work4.sample01;

//예외클래스로 예외 정의
public class OurBadException extends Exception {

    public OurBadException() {
        super("위험한 행동시 해당 예외 호출");
    }
}

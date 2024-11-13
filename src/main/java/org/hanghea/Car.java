package org.hanghea;

public class Car {





    //필드
    //고유데이터
    String company; //자동차 회사
    String model ="gv80";// 자동차 모델
    String color; //자동차 색
    double price; //자동차 가격

    //상태데이터
    double speed; //자동차 속도
    char gear;//자동차 기어
    boolean lights=true;//자동차 라이트


    //객체데이터
    Tire tire = new Tire();
    Door door;
    Handle handle;



    //기본 생성자 : 처음 객체가 생성될 때(인스턴스화) 어떤 로직을 수행해야하며, 어떤 값이 필수로 들어와야하는 지 정의
    public Car() {
        //생략 가능

//        System.out.println("기본 생성자 호출");
    }

    //메서드

    //gasPedal
    //input : km/h
    //output : speed

    double gasPedal(double kmh,char type) {
        changeGear(type); //가속도 페달을 밟으면 자동으로 기어가 변함 >> 메소드 호출
        speed =kmh;
        return speed;
    }


    //brakePedal
    //input : x
    //output : speed
    double brakePedal() {
        return speed;
    }

    //changeGear
    //input : gear(char type)
    //output : gear
    char changeGear(char type) {

        gear =type;
        return gear;
    }


    //onOffLight
    //input : x
    //output : lights(boolean)
    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    //horn
    //input : x
    //output :x
    void horn() {
        System.out.println("빵빵");
    }

    //자동차의 속도 ..가변길이 메서드
    void carSpeeds(double ...speeds) {
        for(double v : speeds) {
            System.out.println("v = "+v);
        }
    }



}

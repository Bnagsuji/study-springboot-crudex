package org.hanghea;

public class Main {
    public static void main(String[] args) {
        //public으로 선언했기 때문에 다른 클래스 접근 가능 (Car 클래스)

        //1.new 키워드를 쓰게 되면 생성자를 호출하게 된다.
//        Car car1 = new Car();
//        Car car2 = new Car();


        //2.Car클래스의 System.out.println("기본 생성자 호출") 프린트

        //공통된 클래스로 다른 객체 생성 가능
//        Car sorento = new Car();
//        Car carnival = new Car();

//        System.out.println(car); //org.hanghea.Car@b4c966a 이라는 주소값이 나옴
        //객체는 복잡해서 다른 곳에 저장하고 주소값을 가져옴.


        //배열로도 가능
//        Car[] cars = new Car[3];
//        Car car3 = new Car();
//        car3.changeGear('P');
//        cars[0] =car3;
//
//        Car car4 = new Car();
//        car4.changeGear('N');
//        cars[1] =car4;
//
//
//        Car car5 = new Car();
//        car5.changeGear('D');
//        cars[2] =car5;
//
//
//        //변수타입이 Car인 애들이 하나하나 할당되도록 cars를 지정
//        for(Car car:cars) {
//            System.out.println("car.gear :"+car.gear);
//
//        }

        Car car = new Car(); //객체 생성 -> 인스턴스화
//        System.out.println("car.model = " + car.model); // 초기값 "Gv80"
//        System.out.println("car.color = " + car.color); // 기본값 null
//        System.out.println();
//
//        System.out.println("car.speed = " + car.speed); // 기본값 0.0
//        System.out.println("car.gear = " + car.gear);  // 기본값 \u0000(공백)
//        System.out.println("car.lights = " + car.lights); // 초기값 true
//        System.out.println();
//
//        System.out.println("car.tire = " + car.tire); // 초기값 인스턴스의 주소
//        System.out.println("car.door = " + car.door); // null
//        System.out.println();
//
//
//        //필드 사용
//        car.color = "blue";
//        car.speed = 100;
//        car.lights = false;
//
//        System.out.println("car.color = " + car.color); //blue
//        System.out.println("car.speed = " + car.speed);  //100
//        System.out.println("car.lights = " + car.lights); // false


        //메서드 호출 및 반환값 저장
        double speed = car.gasPedal(100,'D');
        System.out.println(speed); //100

        car.carSpeeds(100,80);
//        v = 100.0
//        v = 80.0
        System.out.println();

        car.carSpeeds(110,120, 150);
//        v = 110.0
//        v = 120.0
//        v = 150.0



    }
}
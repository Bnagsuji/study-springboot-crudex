package org.hanghea.work4.gen;

// 1. 클래스에 타입변수 지정
public class Generic<T> {
    // 2. 프로퍼티 t의 타입변수 지정
    private T t;
    // 3. 메서드의 리턴 타입에 타입변수 지정
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4. 제네릭을 통해 구현한 클래스를 사용하는 부분
        //타입변수에 들어갈 실제 변수의 값을 넣어줘야 함
        //제네릭 클래스 사용
        Generic<String> stringGeneric = new Generic<>();
        // 5.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}
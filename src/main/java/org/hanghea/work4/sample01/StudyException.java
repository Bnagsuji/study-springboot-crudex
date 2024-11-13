package org.hanghea.work4.sample01;

public class StudyException {

    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
//        ourClass.thisMethodIsDangerous();
        //> 이미 위험하다는 것을 인지하고 있기 때문에 위와 같이 작성불가

        try {
            //일단 실행
            ourClass.thisMethodIsDangerous();
            //thisMethodIsDangerous 메서드는 위험요소를 가지고 있기 때문에 throws로 처리해주고
            //후에 일어날 위험을 처리하기 위해 catch 로 처리


        }catch (OurBadException e) {
            //실행될 예외내용에 대한 메시지 출력
            System.out.println(e.getMessage());//위험한 행동시 해당 예외 호출

        }finally {
            System.out.println("무조건 거치기");
        }





    }
}

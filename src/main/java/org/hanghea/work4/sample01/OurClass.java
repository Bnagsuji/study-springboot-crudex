package org.hanghea.work4.sample01;

public class OurClass
{
    //변경 불가능
    private final Boolean just = true;


    //throws : 예외를 던지다
    public void thisMethodIsDangerous() throws OurBadException {
        //사전에 위험할 수 있다는 인지를 하고 throws를 통해 flag를 달아준다

        if(just) {
            throw new OurBadException();
        }
    }


}

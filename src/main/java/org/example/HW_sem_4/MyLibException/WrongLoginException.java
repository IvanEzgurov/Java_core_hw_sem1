package org.example.HW_sem_4.MyLibException;

public class WrongLoginException extends MyLibException{
    private int loginLength;
    public WrongLoginException(int loginLength){
        super();
        this.loginLength = loginLength;
    }

    @Override
    public String getMessage(){
        return String.format("Введеный логин превышает 20 символов, введено %d символов", loginLength);
    }
}

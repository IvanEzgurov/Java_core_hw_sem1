package org.example.HW_sem_4.MyLibException;

public class WrongPasswordException extends MyLibException{
    private int passwordLength;
    private boolean matchPassword;

    public WrongPasswordException(int passwordLength,boolean matchPassword){
        super();
        this.passwordLength = passwordLength;
        this.matchPassword = matchPassword;
    }

    @Override
    public String getMessage(){
        boolean wrongLength = passwordLength < 20;
        return String.format(
                "Введенный пароль %s, пароли %s совпадают",
                ((wrongLength)? "верной длины": "слишком длинный"),
                ((matchPassword)?"": " не "));

    }
}

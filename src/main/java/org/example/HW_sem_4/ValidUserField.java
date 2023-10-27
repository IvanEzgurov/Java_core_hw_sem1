package org.example.HW_sem_4;

import org.example.HW_sem_4.MyLibException.WrongLoginException;
import org.example.HW_sem_4.MyLibException.WrongPasswordException;

public class ValidUserField {
    private static int loginLength;
    private static int passwordLength;

        public static boolean isValid(String login, String password, String confirmPassword){
            loginLength = login.length();
            passwordLength = password.length();
            boolean isMatch = login.equals(confirmPassword);
            if(loginLength >= 20) {
                throw new WrongLoginException(login.length());
            }
            else if(passwordLength >=20 || !isMatch){
                throw new WrongPasswordException(passwordLength, isMatch);
            }
            return true;
        }
}

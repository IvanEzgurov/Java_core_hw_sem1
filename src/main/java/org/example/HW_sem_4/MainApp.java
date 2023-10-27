package org.example.HW_sem_4;

import org.example.HW_sem_4.MyLibException.WrongLoginException;
import org.example.HW_sem_4.MyLibException.WrongPasswordException;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = sc.nextLine();
        System.out.println("Введите пароль: ");
        String password = sc.nextLine();
        System.out.println("Повторите пароль:");
        String confirmPassword = sc.nextLine();

        boolean checked = false;
        try {
            checked = ValidUserField.isValid(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        System.out.println((checked)?"Логин и пароль приняты":"Логин и пароль не приняты");
    }
}

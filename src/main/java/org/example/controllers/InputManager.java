package org.example.controllers;

import java.util.Scanner;

public class InputManager {

    public String getUserInputFromConsole(String prompt){
        Scanner scanner = new Scanner(System.in);
        String defaultPrompt = "Input a note:";
        if (prompt.isEmpty()) prompt = defaultPrompt;
        try (scanner) {
            System.out.println(prompt + "\n");
            String userInput;
            do {
                userInput = scanner.nextLine();
            } while (!scanner.hasNextLine());

            return userInput;
        }
    }
}

package org.example;

import org.example.controllers.InputManager;
import org.example.controllers.NoteSaverToFile;
import org.example.controllers.Presenter;
import org.example.model.SomeNote;

import java.io.IOException;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws IOException {
        Presenter presenter = new Presenter();
        InputManager input = new InputManager();
        NoteSaverToFile saver = new NoteSaverToFile();

        String noteBody = input.getUserInputFromConsole("Set your note:");
        SomeNote note =new SomeNote(noteBody, new Date());

        presenter.showNoteToConsole(note.toString());

        String saveMassage = saver.saveNote(note);

        System.out.println(saveMassage);

    }
}

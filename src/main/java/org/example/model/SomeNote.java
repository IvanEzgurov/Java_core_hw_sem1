package org.example.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SomeNote {

    private String noteBody;

    private Date noteTimeCreation;

    public SomeNote(String noteBody, Date noteTimeCreation) {
        this.noteBody = noteBody;
        this.noteTimeCreation = noteTimeCreation;
    }

    public String getNoteBody(){
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    public Date getNoteTimeCreation(){
        return noteTimeCreation;
    }

    public void setNoteTimeCreation(Date noteTimeCreation) {
        this.noteTimeCreation = noteTimeCreation;
    }

    @Override
    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return this.getNoteBody() + "\n" +
                formatter.format(this.getNoteTimeCreation());
    }
}

package org.example.model;

import java.io.IOException;

public interface NoteSaver {
    String saveNote(SomeNote note) throws IOException;
}

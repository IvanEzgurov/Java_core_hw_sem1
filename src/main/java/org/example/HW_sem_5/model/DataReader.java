package org.example.HW_sem_5.model;

import java.io.IOException;
import java.util.List;

public interface DataReader {

    public List<Student> readStudents(String url) throws IOException;
}

package org.example.HW_sem_5.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.lang.reflect.Type;

public class StudentsFileReader implements DataReader {
    @Override
    public List<Student> readStudents(String url) throws IOException{
        File file = new File(url);
        if (!file.exists()) throw new FileNotFoundException("There is no " + file.getPath());
        try (FileReader fileReader = new FileReader(file)){
            return parseFile(fileReader);
        }
    }
    private List<Student> parseFile(FileReader fr){
        try {
            Gson gson = new Gson();
            List<Student> list;
            Type studentListType = new TypeToken<List<Student>>() {}.getType();
            list = gson.fromJson(fr, studentListType);
            return list;
        } catch (RuntimeException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
/**
 * Class for reading and parsing the data from JSON students file, which are:

 * {
 *     "name": "John",
 *     "grades": [2,4,65,12]
 *     "speciality": "economist",
 * }
 *
 */
package org.example.HW_sem_5;

import org.example.HW_sem_5.model.Student;
import org.example.HW_sem_5.model.StudentsFileReader;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {
        StudentsFileReader fileReader = new StudentsFileReader();
        final double passingGrade = 4.5;
        try {
            List<Student> studentList = fileReader.readStudents ("resource/students.json");
            List<Student> studentExclusion = studentList.stream()
                    .filter(student -> student.getAverageGrade() > passingGrade)
                    .sorted((student1, student2) -> Double.compare(student2.getAverageGrade(), student1.getAverageGrade()))
                    .collect(Collectors.toList());

            System.out.println("Good students are: \n " + studentExclusion);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

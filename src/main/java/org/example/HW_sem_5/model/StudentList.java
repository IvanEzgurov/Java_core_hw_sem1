package org.example.HW_sem_5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor

public class StudentList<Student> {
    private List<Student> students;

    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> getStudent(){
        return this.students;
    }
}

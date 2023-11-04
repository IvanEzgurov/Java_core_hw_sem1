package org.example.HW_sem_5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
@Getter
@Builder
public class Student {
    private String name;
    private List<Double> grades;
    private String speciality;

    public double getAverageGrade(){
        return this.grades.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }
    public List<Double> getGrades(){
        return this.grades;
    }

    @Override
    public String toString(){
        return "[ Student: " + this.getName()
                + "\t Average grade: " + this.getAverageGrade()
                + " Speciality: " + this.getSpeciality() + " ]\n";
    }
}

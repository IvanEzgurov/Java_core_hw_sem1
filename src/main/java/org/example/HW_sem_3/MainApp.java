package org.example.HW_sem_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Employee worker1 = new Employee("Ivan", "Ivanovich", "Ivanov", LocalDate.of(2001,11,21), "driver", 30000);
        Employee worker2 = new Employee("Dmitry", "Andreevich", "Belov", LocalDate.of(1980, 9, 28), "master", 40000);
        Employee worker3 = new Employee("Oleg", "Sergeevich", "Vizin", LocalDate.of(1990,1, 12), "driver", 30000);
        Employee manager = new Manager("Kiril", "Ivanovich", "Gromov", LocalDate.of(1984,12,24), "manager",50000);

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        System.out.println(employees);
        BirthDayComparator comparator =new BirthDayComparator();
        Collections.sort(employees, comparator);
        System.out.println(employees);

        Manager.increaseSalary(employees,4000);
        System.out.println(employees);

    }
}

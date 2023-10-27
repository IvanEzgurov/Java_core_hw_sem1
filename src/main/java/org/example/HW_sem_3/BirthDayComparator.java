package org.example.HW_sem_3;

import java.util.Comparator;
import java.time.LocalDate;

public class BirthDayComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}


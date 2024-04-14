package Семинар_3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>  { //Создать класс СтудентКомпаратор реализующий интерфейс Comparator
    
    public int compare(Student o1, Student o2) {    //Реализовать контракт compare () со сравнением по какому-либо параметру
                                                    //(пример: сочетание Имя+Фамилия)
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            if (resultOfComparing == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }

}

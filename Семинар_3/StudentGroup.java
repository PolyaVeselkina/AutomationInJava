package Семинар_3;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {       // реализация класса УчебнаяГруппа
                                                                //Модифицировать класс УчебнаяГруппа, 
                                                                //заставив его реализовать интерфейс Iterable
    
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this); //Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
    }

    @Override
    public String toString() {
        return " группа студентов: " + studentList;
    }
    
}

package Семинар_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {   //Создать класс УчебнаяГруппаСервис, добавив в него метод удаления студента по ФИО
    
    private StudentGroup studentGroup;

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = studentGroup.iterator();
            
        while (iterator.hasNext()) {
            System.out.println(" " + iterator.toString()); // посмотреть что в итератор передали
            Student student = iterator.next();
              System.out.println("Следующий: "+ student); // какой следующий студент

            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList() {       //Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
                                                        //сортировки списка студентов по id
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList; 
    }

    public List<Student> getSortedStudentByFIO() {      //Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
                                                        //сортировки списка студентов по ФИО
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComparator());
        return studentList;
    }

    @Override
    public String toString() {
        return "Я сервис, вот что во мне:" + studentGroup;
    }
    
}

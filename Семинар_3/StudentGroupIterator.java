package Семинар_3;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int count;
    private final List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.count = 0;
        this.studentList = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return count < studentList.size() -1;
    }

    @Override
    public Student next() {
        if (!hasNext()) {   //проверяем. есть ли следующее значение, если нет то возврящаем null
            return null;
        }
            System.out.println("До увеличения счетчика - " + count);
        count++;       // если есть, то увеличиваем счетчик на ед.
             System.out.println("После увеличения счетчика -  " +count);
        return studentList.get(count);        // возвращаем текущее значение по индексу каунт
    }

    @Override
    public void remove() {
        System.out.println(count);
        Student student = studentList.remove(count);
    //    studentList.remove(count);
        System.out.println("Кто удалился - " + student);
    }

    @Override
    public String toString() {
        return " Сейчас в итераторе: - " + studentList;
    }

    
    
}

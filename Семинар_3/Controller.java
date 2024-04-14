package Семинар_3;

import java.util.List;

public class Controller {   //Создать класс Контроллер, добавив в него метод удаления студента и
                            //вызывать в нем созданный метод из УчебнаяГруппаСервис
    
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService steamService = new StreamService();  // ДЗ задание №4

    public StudentGroupService getStudentGroupService() {
        return studentGroupService;
    }


    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }


    public List<Student> getSortedStudentList() {       //Модифицировать класс Контроллер, добавив в него метод сортировки
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO() {       //Модифицировать класс Контроллер, добавив в него метод сортировки
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<Stream> getSortedStream() {      // ДЗ - задача №5
        return steamService.getSortedStream();
}
}

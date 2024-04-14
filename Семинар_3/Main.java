package Семинар_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Создать класс Студент
// Создать класс УчебнаяГруппа
// Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
// Реализовать его контракты (включая удаление)


public class Main {
    public static void main (String[] args) {
        
        Student st1 = new Student();
        st1.setFirstName("Саша");
        Student st2 = new Student();
        st2.setFirstName("Паша");

        //System.out.println(st1);
        Student st3 = new Student();
        st3.setFirstName("John");
        st3.setLastName("Lenon");
        st3.setMiddleName("Petrovich");
        Student st4 = new Student();
        st4.setFirstName("Вася");
        st4.setLastName("Jakson");
        st4.setMiddleName("Petrovich");
        Student st5 = new Student();
        st5.setFirstName("Альбус");


        Student st6 = new Student();
        st6.setFirstName("Миша");
        st6.setLastName("Lenon");
        st6.setMiddleName("Petrovich");
        Student st7 = new Student();
        st7.setFirstName("Паша");
        st7.setLastName("Jakson");
        st7.setMiddleName("Petrovich");

        Student st8 = new Student();
        st8.setFirstName("Коля");
        st8.setLastName("Lenon");
        st8.setMiddleName("Petrovich");
        Student st9 = new Student();
        st9.setFirstName("Павел");
        st9.setLastName("Jakson");
        st9.setMiddleName("Petrovich");
       
        Student st10 = new Student();
        st10.setFirstName("Воля");
        st10.setLastName("Lenon");
        st10.setMiddleName("Petrovich");
        Student st11 = new Student();
        st11.setFirstName("Бульдог");
        st11.setLastName("Jakson");
        st11.setMiddleName("Petrovich");
        Student st12 = new Student();
        st11.setFirstName("Тимур");
        st11.setLastName("Jakson");
        st11.setMiddleName("Petrovich");
        
        List<Student> studentList1 = new ArrayList<>();// первый список студентов
        studentList1.add(st1);
        studentList1.add(st2);

 // System.out.println(studentList1);

        List<Student> studentList2 = new ArrayList<>(); // второй список студентов
        studentList2.add(st4);
        studentList2.add(st3);
        studentList2.add(st5);

   // System.out.println(studentList2);

        List<Student> studentList3 = new ArrayList<>(); // второй список студентов
        studentList3.add(st6);
        studentList3.add(st7);
        studentList3.add(st8);

        List<Student> studentList4 = new ArrayList<>(); // второй список студентов
        studentList4.add(st8);
        studentList4.add(st9);
        

        List<Student> studentList5 = new ArrayList<>(); // второй список студентов
        studentList5.add(st10);
        studentList5.add(st11);

        StudentGroup group1 = new StudentGroup();
        group1.setStudentList(studentList1);           // записали первый список студентов в первую группу

        StudentGroup group2 = new StudentGroup();
        group2.setStudentList(studentList2);           // записали второй список студентов во вторую группу

        StudentGroup group3 = new StudentGroup();
        group3.setStudentList(studentList3); 

        StudentGroup group4 = new StudentGroup();
        group4.setStudentList(studentList4); 

        StudentGroup group5 = new StudentGroup();
        group5.setStudentList(studentList5); 

   //    System.out.println(group1);
  //     System.out.println(group2);

       Controller controller = new Controller();        // создали контролеер
       StudentGroupService service = controller.getStudentGroupService();         // получили сервис из контроллера
       service.setStudentGroup(group2);                 // отправили в сервис группу студентов


     //  System.out.println(controller.getStudentGroupService());
   //    System.out.println(service);
 //      List<Student> studentListInServiceAfterSort = service.getSortedStudentByFIO();

 //      System.out.println("После сортировки " + studentListInServiceAfterSort); // Сервис после сортировки


//ВОПРОС ???? 
      //Почему если удалять Васю он не удаляется? В методе remove() счетчик становиться равный не 0, а 1 
      // т.к метод next()  - увеличит нам перменную count, а т.к у "Васи" порядковый номер 0 в масиве, следовательно
      // мы его проскакиваем. В методе removeStudentByFIO () мы "Васю" сравниваем не с "Васей", а уже с "John"
      // В чем ошибка? И как надо было сделать?
//ВОПРОС ????

   //    service.removeStudentByFIO("Вася", "Jakson", "Petrovich");  // проверка удаления
  //     service.removeStudentByFIO("John", "Lenon", "Petrovich");  // проверка удаления

  //     System.out.println("После удаления: " + service); // вывели сервис с переданной в него группой после удаления студента

       
       List<StudentGroup> studentGroupListOne = new ArrayList<>();
       studentGroupListOne.add(group1);
       studentGroupListOne.add(group2);

       List<StudentGroup> studentGroupListTwo = new ArrayList<>();
       studentGroupListTwo.add(group3);
       studentGroupListTwo.add(group4);
       studentGroupListTwo.add(group5);

      //  System.out.println(studentGroupListOne);
      //  System.out.println(studentGroupListTwo);

       Stream stream1 = new Stream();
       Stream stream2 = new Stream();

       stream1.setStudentGroupList(studentGroupListOne);
       stream2.setStudentGroupList(studentGroupListTwo);

    //   System.out.println(stream1);
     //  System.out.println(stream2);

       

       
      //  System.out.println("Список групп первого потока - " + stream1.getStudentGroupList());
      //  System.out.println("количество групп " + stream1.getStudentGroupList().size());

      //  System.out.println("Список групп второго потока  " + stream2.getStudentGroupList());
      //  System.out.println("количетсво групп " + stream2.getStudentGroupList().size());

      //  System.out.println("-----------------Первый способ---------------------");

      //  System.out.println("Ответ? " + stream1.compareTo(stream2));// первый  способ

      //  System.out.println("-----------------Второй способ---------------------");

      //  StreamComparator streamComparator = new StreamComparator();

      //  System.out.println("Больше? " + streamComparator.compare(stream2, stream1)); //ЗАДАНИЕ №2 из ДЗ


//ЗАДАНИЕ №3 из ДЗ (проверка)
       List<Stream> streamList = new  ArrayList<>(); // список потоков     
       streamList.add(stream2);
       streamList.add(stream1);

       StreamService streamService = new StreamService(); //сервис потоков
       streamService.setStreamList(streamList); // передали в сервис потоков - список потокв

        System.out.println("До сортировки -------" + streamService); // до соритирвоки

       //streamService.getSortedSream();

       System.out.println("-----------------------------------------------------------------------------------" );

       List<Stream> streamListSorted = streamService.getSortedStream();

       System.out.println("После сортирвоки --------" + streamListSorted); //после сортирвоки


//ЗАДАНИЕ №3 из ДЗ (проверка конец)
       


       



      //   Iterator<Student> it1 = group1.iterator();
      //   Iterator<Student> it2 = group2.iterator();
        

        

    }
}

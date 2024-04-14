package Семинар_3;

public class Student implements Comparable<Student> {         // реализация класса Студент
                                //Модифицировать класс Студент, заставив его реализовать интерфейс Comparable

    private Long studentID;
    private String firstName;
    private String lastName;
    private String middleName;
    //////////////
    public Long getStudentID() {
        return studentID;
    }
    
    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
    /////////////

    /////////////
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /////////////

    /////////////////
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    ///////////////
    
    /////////////
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /////////////


    @Override //Для проверки вывода стуенда
    public String toString() {
        return " " + firstName;
    }


    public int compareTo(Student o) {            //Реализовать контракт compareTo () со сравнением по какому-либо
                                                //параметру (пример studentId)
        return this.studentID.compareTo(o.studentID);
    }
}

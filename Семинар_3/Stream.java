package Семинар_3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> , Comparable<Stream> {
   
    private List<StudentGroup> studentGroupList;

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this); //Реализовать метод iterator() возвращающий экземпляр созданного нами итератора
    }

    @Override
    public int compareTo(Stream o) {

         int sizeOne =  this.studentGroupList.size();
         int size = o.studentGroupList.size();
         int result = 0;

         if (sizeOne < size) {
            return result -1;
            
         }
         else if(sizeOne > size){
            return result +1;
         }
         else {
            return result ;
         }
      
       
        
    }

    @Override
    public String toString() {
        return "В этом потоке такие-то группы: " + studentGroupList;
    }

    
}

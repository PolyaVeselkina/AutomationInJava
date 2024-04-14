package Семинар_3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    public int compare(Stream g1, Stream g2) {    //Реализовать контракт compare () со сравнением по какому-либо параметру
             
        
        int sizeOne =  g1. getStudentGroupList().size();
         int size = g2. getStudentGroupList().size();
         int result = 0;

         if (sizeOne < size) {
        //    System.out.println("Поток " + g1 + " -меньше потока " + g2 );
            return result -1;
            
         }
         else if(sizeOne > size){
        //    System.out.println("Поток " + g1 + " - больше потока " + g2 );
            return result +1;
         }
         else {
        //    System.out.println("В потоках равное количество групп" );
            return result ;
         }
    }


    
}

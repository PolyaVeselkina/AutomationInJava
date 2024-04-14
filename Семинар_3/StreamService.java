package Семинар_3;

import java.util.ArrayList;
import java.util.List;

public class StreamService {  // ДЗ задание№ 3

     private List<Stream> streamList;

    public void setStreamList(List<Stream> streamList) {
        this.streamList = streamList;
    }

    public List<Stream> getSortedStream() {      
                                                              
        List<Stream> streamListSorted = new ArrayList<>(streamList);
      
        streamListSorted.sort(new StreamComparator() );

        return streamListSorted;
}

    @Override
    public String toString() {
        return "StreamService [streamList=" + streamList + "]";
    }

}

package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup>{
    private int count;
    private final List<StudentGroup> stream;

    public StudentStreamIterator(List<StudentGroup> stream) {
        this.stream = stream;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < stream.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
    
        }
        return stream.get(count++);
    }
}
package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{

    // список групп студентов, из которых состоит поток
    private List<StudentGroup> stream;



    public StudentStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(stream);
    }

}

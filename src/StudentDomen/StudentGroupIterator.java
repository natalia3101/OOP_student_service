package StudentDomen;

import java.util.Iterator;
import java.util.List;

// этот итератор можно вынести в отдельный файл как тут или сделать анонимным (? не уверена, что он так называется), тогда он 
// располагается внутри основного файла studentGroup
public class StudentGroupIterator implements Iterator<Student> {
    private int count;
    private final List<Student> students;
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.count = 0;
    }
    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student next() {
        if(!hasNext()){
            return null;
    
        }
        return students.get(count++);
    }
    
}

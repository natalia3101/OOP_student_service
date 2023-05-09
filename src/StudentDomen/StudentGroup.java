package StudentDomen;

import java.util.Iterator;
import java.util.List;

// создаем группу студентов. наследуются признаки студента, есть возможность сравнения групп между собой
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    @Override
    public int compareTo(StudentGroup o) {
            // Сравниваем по количеству студентов в группе
        if(this.students.size() == o.getStudents().size()){
        return 0;
        }
        if (this.students.size() < o.getStudents().size()){
            return -1;
        }
        return 1;
    }

}


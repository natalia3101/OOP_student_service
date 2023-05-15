package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

public class StudentGroupService {
    
    private List<StudentGroup> groups;
    
    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }

        // получение списка всех групп
    public List<StudentGroup> getAll(){
        return this.groups;
    }

    public List<Student> getSortedByNameStudentGroup(int numberGroup)
    {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}

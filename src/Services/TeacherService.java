package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

// подключаем к классу обобщенный интерфейс iUserService
public class TeacherService implements iUserService<Teacher> {
    // это порядковый номер учителей
    private int count;
    private String academicDegree;
    // список учителей
    private List<Teacher> teachers;
    public TeacherService()
    {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public  List<Teacher> getAll() {
        return this.teachers;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Teacher num1 = new Teacher(firstName, lastName, age, count, academicDegree);
        count++;
        teachers.add(num1);
    }

        // метод вывода списка учителей, отсортированного обобщенным классом UserComparator
    public List<Teacher> getSortedByNameTeacher()
    {
        List<Teacher> teachersSorted = new ArrayList<>(teachers);
        teachersSorted.sort(new UserComparator<Teacher>());
        return teachersSorted;
    }
    
}

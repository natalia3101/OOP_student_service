package Services;
import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

public class StudentService implements iUserService<Student>{
    private int count;
    private List<Student> students;
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
    // метод получения все студентов, которые есть в сервисе
    @Override
    public List<Student> getAll() {
        return students;
    }
    @Override
    public void create(String firstName, String lastName, int age) {
        Student num1 = new Student(firstName, lastName, age, count);
        count++;
        students.add(num1);
    }



}

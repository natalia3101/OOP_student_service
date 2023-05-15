package Controllers;

import Services.StudentGroupService;
import Services.StudentService;
import StudentDomen.Student;

public class StudentController implements iUserController<Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

    @Override
    public void create(String firstName, String lastName, int age) {
      dataService.create(firstName, lastName, age);
    }

        
}

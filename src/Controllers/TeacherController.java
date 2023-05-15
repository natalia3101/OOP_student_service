package Controllers;

import StudentDomen.Teacher;

import Services.TeacherService;

public class TeacherController implements iUserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
// создаем учителя и переопределяем от iUserController
    @Override
    public void create(String firstName, String lastName, int age) {
      teacherService.create(firstName, lastName, age);
    }
 
}

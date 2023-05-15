import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.event.SwingPropertyChangeSupport;

import Controllers.EmployeeController;
import Services.AverageAge;
import Services.TeacherService;
import StudentDomen.Employee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.Teacher;
import StudentDomen.User;

public class App {

    public static void main(String[] args) throws Exception {
        User u1 = new User("Nat", "Slepenko", 27);
        Student s1 = new Student("Galina", "Slepenko", 60, 543);
        Student s2 = new Student("Dima", "Slepenko", 32, 523);
        Student s3 = new Student("Nat", "Babenko", 25, 53);
        Student s4 = new Student("Petr", "Slepenko", 65, 343);
        Student s5 = new Student("Chris", "Manulina", 26, 943);
        Student s6 = new Student("Lou", "H", 34, 843);
        Student s7 = new Student("Arthur", "C", 41, 93);
        Student s8 = new Student("Amelia", "R", 52, 81);
        Student s9 = new Student("Nick", "A", 16, 45);
        Student s10 = new Student("Ari", "T", 76, 46);
        Student s11 = new Student("Fred", "W", 29, 15);
        Student s12 = new Student("Ginni", "W", 22, 16);
        Student s13 = new Student("Germione", "G", 24, 22);
        Student s14 = new Student("Harry", "P", 23, 24);
        Student s15 = new Student("Peter", "P", 52, 32);
        Student s16 = new Student("Lily", "T", 36, 88);
        Student s17 = new Student("John", "U", 50, 11);
        Student s18 = new Student("Kate", "L", 42, 22);

        // разбиваем студентов на группы
        List<Student> listStudents1 = new ArrayList<Student>();
        listStudents1.add(s1);
        listStudents1.add(s2);
        listStudents1.add(s3);
        listStudents1.add(s4);
        listStudents1.add(s5);
        StudentGroup group1 = new StudentGroup(listStudents1);

        List<Student> listStudents2 = new ArrayList<Student>();
        listStudents2.add(s6);
        listStudents2.add(s7);
        listStudents2.add(s8);
        StudentGroup group2 = new StudentGroup(listStudents2);

        List<Student> listStudents3 = new ArrayList<Student>();
        listStudents3.add(s9);
        listStudents3.add(s10);
        listStudents3.add(s11);
        listStudents3.add(s12);
        StudentGroup group3 = new StudentGroup(listStudents3);

        List<Student> listStudents4 = new ArrayList<Student>();
        listStudents4.add(s13);
        listStudents4.add(s14);
        listStudents4.add(s15);
        listStudents4.add(s16);
        listStudents4.add(s17);
        listStudents4.add(s18);
        StudentGroup group4 = new StudentGroup(listStudents4);


        // Это сортировка внутри группы
        // StudentGroup group1 = new StudentGroup(listStudents1);

        // for(Student stud : group1)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group1.getStudents());


        // for(Student stud : group1)
        // {
        //     System.out.println(stud);
        // }


        // создаем поток, состоящий из нескольких групп. Наверняка этот процесс разбиения и объединения можно оптимизировать, но пока так
        List<StudentGroup> allGroups = new ArrayList<StudentGroup>();
        allGroups.add(group1);
        allGroups.add(group2);
        allGroups.add(group3);
        allGroups.add(group4);
        StudentStream stream1 = new StudentStream(allGroups);

        // Перечисляем группы в потоке
        for(StudentGroup group : stream1) {

            System.out.println(group);
            
            // Перечисляем студентов в каждой группе
            for(Student stud : group)
                System.out.println(stud);
        }
        
        System.out.println("===============Сортировка групп по числу студентов===============");

        Collections.sort(stream1.getStream());

        for(StudentGroup group : stream1){
            System.out.println(group);
            // Перечисляем студентов в каждой группе
            for(Student stud : group)
                System.out.println(stud);
        }

            // Employee emp1 = new Employee("Nat", "F", 27, 0);
    // EmployeeController.paySalary(emp1);

    Integer studHours[] = {124, 65, 142, 2};
    System.out.println(EmployeeController.mean(studHours));

    Double empSalary[] = {12665.65, 4456645.0, 34423423.2, 2344.55};
    System.out.println(EmployeeController.mean(empSalary));

        

    AverageAge<Teacher> avAgeTeachers = new AverageAge<Teacher>();
    System.out.println(avAgeTeachers.avAge(TeacherService.getAll()));


    }  
    
}


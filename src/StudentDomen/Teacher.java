package StudentDomen;

// еще один участник образовательного процесса, пока с ним никак не взаимодействуем.
// имеет имя, фамилию, возраст, id, степень
public class Teacher extends User {
        
    private int teacherId;
    private String academicDegree;

    public Teacher(String firstName, String lastName, int age, int teacherId, String academicDegree ) {
        super(firstName, lastName, age);
       this.teacherId = teacherId;
       this.academicDegree = academicDegree;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getLevel() {
        return academicDegree;
    }

    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }

}

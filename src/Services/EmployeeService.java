package Services;
import java.util.ArrayList;
import java.util.List;
import StudentDomen.Employee;
import StudentDomen.UserComparator;

public class EmployeeService implements iUserService<Employee> {
    private int count;
    private List<Employee> employees;
    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Employee num1 = new Employee(firstName, lastName, age, count);
        count++;
        employees.add(num1);
    }

    public List<Employee> getSortedByNameStudentGroup(int numberGroup)
    {
        List<Employee> employeesSorted = new ArrayList<>(employees);
        employeesSorted.sort(new UserComparator<Employee>());
        return employeesSorted;
    }
}

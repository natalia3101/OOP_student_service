package Controllers;

import Services.EmployeeService;
import StudentDomen.Employee;
import StudentDomen.User;

public class EmployeeController implements iUserController<Employee>{
    private final EmployeeService empService = new EmployeeService();

    @Override
    public void create(String firstName, String lastName, int age) {
        empService.create(firstName, lastName, age);
    }

    // тип Т  - дженерик, метод будет применяться для всех потомковкрасса employee
    // при добавлении extends позволяет контролировать код по типам, 
    // то есть нельзя будет выплатить зп ко-то кроме работников
    static public <T extends Employee> void paySalary(T person){
        System.out.println(((User) person).getLastName() + " got salaty 3k eur");
    }

    // метод для вычисления среднего показателя
    static public <T extends Number> double mean(T[] num)
    {
        double sum = 0.0;
        for(int i = 0; i < num.length; i++)
        {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
    
}

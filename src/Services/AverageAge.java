package Services;

import java.util.List;
import StudentDomen.User;

// метод дженерик для вычисления среднего возраста любого юзера
public class AverageAge <T extends User>{
    public double avAge(List<T> users)
    {
        int sum = 0;
        for(int i = 0; i < users.size(); i++)
        {
            sum = sum + ((User) users).getAge();
        }
        return (sum / users.size());
    }
}


package Services;

import java.util.List;

// <T> делает интерфейс дженериком
public interface iUserService<T> {
    List<T> getAll();
    void create(String firstName, String lastName, int age);
    
}

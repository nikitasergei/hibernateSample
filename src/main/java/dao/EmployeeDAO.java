package dao;

import entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    //create
    void add(Employee employee);

    //update
    void update(Employee employee);

    //read
    Employee getById(Long id);

    List<Employee> getAll();

    //delete
    void remove(Employee employee);
}

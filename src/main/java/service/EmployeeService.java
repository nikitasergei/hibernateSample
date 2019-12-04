package service;

import businesLogic.SessionUtil;
import dao.EmployeeDAO;
import entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeService extends SessionUtil implements EmployeeDAO {
    @Override
    public void add(Employee employee) {
        openTransactionSession();

        Session session = getSession();
        session.save(employee);

        closeTransactionSession();
    }

    @Override
    public void update(Employee employee) {
        openTransactionSession();
        Session session = getSession();
        session.update(employee);

        closeTransactionSession();
    }

    @Override
    public Employee getById(Long id) {
        openTransactionSession();
        String sql = "SELECT * FROM employee WHERE ID= :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Employee.class);
        query.setParameter("id", id);

        Employee employee = (Employee) query.getSingleResult();
        closeTransactionSession();

        return employee;
    }

    @Override
    public List<Employee> getAll() {
        openTransactionSession();

        String sql = "SELECT * FROM employee";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Employee.class);
        List employeesList = query.list();

        closeTransactionSession();
        return employeesList;
    }

    @Override
    public void remove(Employee employee) {
        openTransactionSession();
        Session session = getSession();
        session.remove(employee);
        closeTransactionSession();
    }
}

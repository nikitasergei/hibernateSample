import businesLogic.HibernateUtil;
import entity.Address;
import entity.Employee;
import entity.Project;
import org.hibernate.Session;
import service.AddressService;
import service.EmployeeService;
import service.ProjectService;

import java.util.Calendar;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {



        AddressService addressService = new AddressService();
        ProjectService projectService = new ProjectService();
        EmployeeService employeeService = new EmployeeService();

        Address address = new Address();
        address.setCountry("DC");
        address.setCity("Gotham city");
        address.setStreet("Arkham street 1");
        address.setPostCode("12345");

        Project project = new Project();
        project.setTitle("Gotham PD");

        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setLastName("Gordon");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1939, Calendar.MAY, 1);
        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress(address);

        Set<Employee> employees = new HashSet<>();
        employees.add(employee);
        project.setEmployees(employees);

        Set<Project> projects = new HashSet<>();
        projects.add(project);
        employee.setProjects(projects);

        addressService.add(address);
        projectService.add(project);
        employeeService.add(employee);
        HibernateUtil.shutdown();

    }
}

package Employee_Endpoint.dao;

import Employee_Endpoint.model.Response;
import Employee_Endpoint.model.Employee;
import Employee_Endpoint.model.ResponseMessage;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    Response registerEmployee(Employee employee);

    List<Employee> getListOfEmployees();

    List<Employee> getListOfPredefinedEmployees();


    Optional<Employee> getEmployeeByEmail(String employee);

    ResponseMessage deleteEmployeeByEmail(String email);

    Response updateEmployeeByEmail(String email, Employee employee);

}

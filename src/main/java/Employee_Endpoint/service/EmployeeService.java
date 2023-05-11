package Employee_Endpoint.service;

import Employee_Endpoint.dao.EmployeeDao;
import Employee_Endpoint.model.Response;
import Employee_Endpoint.model.ResponseMessage;
import Employee_Endpoint.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(@Qualifier("employeeDao") EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Response registerEmployee(Employee employee) {
        return employeeDao.registerEmployee(employee);
    }

    public List<Employee> getListOfEmployees() {
        return employeeDao.getListOfEmployees();
    }

    public List<Employee> getListOfPredefinedEmployees() {
        return employeeDao.getListOfPredefinedEmployees();
    }

    public Optional<Employee> getEmployeeByEmail(String email) {
        return employeeDao.getEmployeeByEmail(email);
    }


    public ResponseMessage deleteEmployeeByEmail(String email) {
        return employeeDao.deleteEmployeeByEmail(email);
    }


    public Response updateEmployeeByEmail(String email, Employee employee) {
        return employeeDao.updateEmployeeByEmail(email, employee);
    }
}

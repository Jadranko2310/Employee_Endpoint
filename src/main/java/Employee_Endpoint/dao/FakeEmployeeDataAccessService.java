package Employee_Endpoint.dao;


import Employee_Endpoint.model.*;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("employeeDao")
public class FakeEmployeeDataAccessService implements EmployeeDao{


    private List<Employee> DB = new ArrayList<>();

    @Override
    public Response registerEmployee(Employee employee) {
            DB.add(employee);
            Response response = new Response("User created", employee);
            return response;
    }

    @Override
    public List<Employee> getListOfEmployees(){
        return DB;
    }

    @Override
    public List<Employee> getListOfPredefinedEmployees() {
        FakeEmployeesList employeesList = new FakeEmployeesList();
        DB.add(employeesList.employee());
        return DB;
    }

    @Override
    public Optional<Employee> getEmployeeByEmail(String email) {
       return DB.stream()
                .filter(employee -> employee.getCompanyEmail().equals(email))
                .findFirst();
    }

    @Override
    public ResponseMessage deleteEmployeeByEmail(String email) {
        Optional<Employee> employeeToCheck = getEmployeeByEmail(email);
        DB.remove(employeeToCheck.get());
        ResponseMessage message = new ResponseMessage("User Deleted");
        return message;
    }

    @Override
    public Response updateEmployeeByEmail(String email, Employee employeeUpdateBody) {
        Response badResponse = new Response("Something is wrong");
        return getEmployeeByEmail(email)
                .map(p -> {
                    int indexOfPersonToUpdate = DB.indexOf(p);
                    if (indexOfPersonToUpdate >= 0){
                        EmployeeBody body = new EmployeeBody();
                        DB.set(indexOfPersonToUpdate, body.employeeBody(employeeUpdateBody));
                        Response response = new Response("Employee info updated", employeeUpdateBody);
                        return response;
                    }
                    return badResponse;
                }).orElse(badResponse);
    }
}

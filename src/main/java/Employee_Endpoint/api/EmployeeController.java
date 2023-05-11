package Employee_Endpoint.api;
import Employee_Endpoint.model.Response;
import Employee_Endpoint.model.ResponseMessage;
import Employee_Endpoint.model.Employee;
import Employee_Endpoint.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/employee")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    private ResponseMessage responseMessage;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/register")
    public ResponseEntity<Object> registerEmployee(@RequestBody Employee employee) {

        Optional<Employee> employeeCheck = employeeService.getEmployeeByEmail(employee.getCompanyEmail());

        if (employeeCheck.isPresent()) {
            responseMessage = new ResponseMessage("The user already exists");
            return new ResponseEntity<>(responseMessage, HttpStatus.NOT_ACCEPTABLE);
        }
        if (employee.getCompanyEmail().isEmpty()) {
            responseMessage = new ResponseMessage("The email can not be empty");
            return new ResponseEntity<>(responseMessage, HttpStatus.BAD_REQUEST);
        } else {
            Response response = employeeService.registerEmployee(employee);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }

    @GetMapping("/allEmployees")
    public List<Employee> getListOfEmployees() {
        return employeeService.getListOfEmployees();
    }

    @GetMapping("/predefined")
    public List<Employee> getListOfPredefinedEmployees() {
        return employeeService.getListOfPredefinedEmployees();
    }


    @GetMapping("/getEmployee")
    public ResponseEntity<Object> getEmployeeByEmail(@PathVariable("email") @RequestParam String email) {
        Optional<Employee> employee = employeeService.getEmployeeByEmail(email);
        ResponseMessage response = new ResponseMessage("The user with this email does not exist");
        if (employee.isEmpty()) {
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        }
    }

    @DeleteMapping("/deleteEmployee")
    public ResponseEntity<Object> deleteEmployeeByEmail(@PathVariable("email") @RequestParam String email) {
        Optional<Employee> employee = employeeService.getEmployeeByEmail(email);
        if (employee.isEmpty()) {
            ResponseMessage message = new ResponseMessage("Used does not exist");
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
        } else {
            ResponseMessage message = employeeService.deleteEmployeeByEmail(email);
            return new ResponseEntity<>(message, HttpStatus.OK);
        }
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<Object> updateEmployeeByEmail(@PathVariable("email") @RequestParam String email,
                                                        @RequestBody Employee employee) {
        Optional<Employee> employeeCheck = employeeService.getEmployeeByEmail(email);
        if (employeeCheck.isEmpty()) {
            responseMessage = new ResponseMessage("The user with this email does not exists");
            return new ResponseEntity<>(responseMessage, HttpStatus.NOT_FOUND);
        } else {
            Response response = employeeService.updateEmployeeByEmail(email, employee);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }

}
package Employee_Endpoint.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class EmployeeList {

    private List<Employee> DBase = new ArrayList<>();
}

package Employee_Endpoint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Response {
    private String message;

    private Employee employee;

    public Response(){}

    public Response (@JsonProperty("message") String message) {
        this.message = message;
    }

    public Response(@JsonProperty("message") String message,
                    @JsonProperty("employee") Employee employee) {
        this.message = message;
        this.employee = employee;
    }
}


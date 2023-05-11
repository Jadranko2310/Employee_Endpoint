package Employee_Endpoint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadRequest {

    private String badResponse;

    public BadRequest(){}

    public BadRequest(@JsonProperty("badResponse") String badResponse) {
        this.badResponse = badResponse;
    }
}

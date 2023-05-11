package Employee_Endpoint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DirectManager {
    private String fullName;
    private String companyEmail;

    public DirectManager(@JsonProperty("fullName") String fullName,
                         @JsonProperty("companyEmail") String companyEmail) {
        this.fullName = fullName;
        this.companyEmail = companyEmail;
    }
}

package Employee_Endpoint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessAction {

    private String actionSuccess;

    public SuccessAction(){}

    public SuccessAction(@JsonProperty("actionSuccess") String actionSuccess) {
        this.actionSuccess = actionSuccess;
    }
}

package Employee_Endpoint.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseMessage {
    private String responseMessage;

    public ResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}

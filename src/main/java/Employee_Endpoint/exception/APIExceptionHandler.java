package Employee_Endpoint.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class APIExceptionHandler {

    @ExceptionHandler(value = {APIExceptionRequest.class})
    public ResponseEntity<Object> handleApiRequestException(APIExceptionRequest e){
        ApiException exception = new ApiException(e.getMessage(),
                e,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
       return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);

    }
}

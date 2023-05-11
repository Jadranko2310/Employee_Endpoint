package Employee_Endpoint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Division {
    private String name;
    private TravelAndAccommodationCostsApprover travelAndAccommodationCostsApprover;

    public Division(@JsonProperty("name") String name,
                    @JsonProperty("travelAndAccommodationCostsApprover") TravelAndAccommodationCostsApprover travelAndAccommodationCostsApprover) {
        this.name = name;
        this.travelAndAccommodationCostsApprover = travelAndAccommodationCostsApprover;
    }
}

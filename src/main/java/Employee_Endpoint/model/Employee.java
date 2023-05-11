package Employee_Endpoint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;
import java.util.List;

@Getter
@Setter
public class Employee {


    public Employee() {
    }

    public Employee(@JsonProperty("hrmProfileID") int hrmProfileID,
                    @JsonProperty("profilePictureURL") URL profilePictureURL,
                    @JsonProperty("fullName") String fullName,
                    @JsonProperty("branch") String branch,
                    @JsonProperty("phoneNumber") String phoneNumber,
                    @JsonProperty("companyEmail") String companyEmail,
                    @JsonProperty("gender") Gender gender,
                    @JsonProperty("shirtSize") ShirtSize shirtSize,
                    @JsonProperty("roles") List<Roles.roles> roles,
                    @JsonProperty("positions") List<String> positions,
                    @JsonProperty("primaryTechStack") List<PrimaryTechStack> primaryTechStack,
                    @JsonProperty("secondaryTechStacks") List<SecondaryTechStacks> secondaryTechStacks,
                    @JsonProperty("passportNumber") String passportNumber,
                    @JsonProperty("directManager") List<DirectManager> directManager,
                    @JsonProperty("division") List<Division> division) {
        this.hrmProfileID = hrmProfileID;
        this.profilePictureURL = profilePictureURL;
        this.fullName = fullName;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
        this.companyEmail = companyEmail;
        this.gender = gender;
        this.shirtSize = shirtSize;
        this.roles = roles;
        this.positions = positions;
        this.primaryTechStack = primaryTechStack;
        this.secondaryTechStacks = secondaryTechStacks;
        this.passportNumber = passportNumber;
        this.directManager = directManager;
        this.division = division;
    }

    private int  hrmProfileID;
    private URL profilePictureURL;
    private String fullName;
    private String branch;
    private String phoneNumber;
    private String companyEmail;


    private Gender gender;
    private ShirtSize shirtSize;
    private List<Roles.roles> roles;
    private List<String> positions;
    private List<PrimaryTechStack> primaryTechStack;
    private List<SecondaryTechStacks> secondaryTechStacks;
    private String passportNumber;
    private List<DirectManager> directManager;
    private List<Division> division;

}

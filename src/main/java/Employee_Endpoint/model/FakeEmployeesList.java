package Employee_Endpoint.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FakeEmployeesList {

    private Employee employee;

    public FakeEmployeesList() {
    }

    public Employee employee(Employee employee){
        this.employee = employee;
        return employee;
    }

    public Employee employee () {


        List<Roles.roles> roles = new ArrayList<>();
        roles.add(Roles.roles.EMPLOYEE);
        roles.add(Roles.roles.CDO_REP);

        List<PrimaryTechStack> primary = new ArrayList<>();
        primary.add(PrimaryTechStack.JAVA);
        primary.add(PrimaryTechStack.PYTON);

        List<SecondaryTechStacks> secondary = new ArrayList<>();
        secondary.add(SecondaryTechStacks.GOLANG);
        secondary.add(SecondaryTechStacks.RUBY);

        List<String> positions = new ArrayList<>();
        positions.add("qa");
        positions.add("internee");

        List<String> primaryTechStacks = new ArrayList<>();
        primaryTechStacks.add("JAVA");
        primaryTechStacks.add("RestAssured");

        List<String> secondaryTechStacks = new ArrayList<>();
        secondaryTechStacks.add("Mjau");
        secondaryTechStacks.add("MjauMjau");

        URL fakeUrL;
        try {
            fakeUrL = new URL("http://example.com/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        DirectManager directManager = new DirectManager("Marko Markovic", "marko.markovic@htec.com");
        DirectManager directManager2 = new DirectManager("Petar Petrovic", "petar.petrovic@htec.com");
        List<DirectManager> directManagers = new ArrayList<>();
        directManagers.add(directManager);
        directManagers.add(directManager2);
        List<Division> divisions = new ArrayList<>();
        TravelAndAccommodationCostsApprover t =
                new TravelAndAccommodationCostsApprover("Pero Pero", "pero@htec.com");
        Division division = new Division("AI", t);
        TravelAndAccommodationCostsApprover t2 = new TravelAndAccommodationCostsApprover("Loki", "loki@htec.com");
        Division division2 = new Division("Intern", t2);
        divisions.add(division);
        divisions.add(division2);




        Employee employee = new Employee();
        employee.setHrmProfileID(22344);
        employee.setProfilePictureURL(fakeUrL);
        employee.setFullName("Jadranko Jankovic");
        employee.setBranch("Banja Luka");
        employee.setPhoneNumber("225 - 883");
        employee.setCompanyEmail("jasa@htec.com");
        employee.setGender(Gender.M);
        employee.setShirtSize(ShirtSize.M);
        employee.setRoles(roles);
        employee.setPositions(positions);
        employee.setPrimaryTechStack(primary);
        employee.setSecondaryTechStacks(secondary);
        employee.setPassportNumber("223344");
        employee.setDirectManager(directManagers);
        employee.setDivision(divisions);

        return employee;
    }
}

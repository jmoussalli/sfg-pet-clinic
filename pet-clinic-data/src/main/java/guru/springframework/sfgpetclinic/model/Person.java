package guru.springframework.sfgpetclinic.model;

/**
 * Package :  guru.springframework.sfgpetclinic.model
 * Created by jerom on 24/11/2020 at 18:19
 */
public class Person {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

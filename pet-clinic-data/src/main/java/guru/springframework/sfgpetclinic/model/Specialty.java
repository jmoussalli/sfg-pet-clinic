package guru.springframework.sfgpetclinic.model;

/**
 * Package :  guru.springframework.sfgpetclinic.model
 * Created by jerom on 11/01/2021 at 12:46
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

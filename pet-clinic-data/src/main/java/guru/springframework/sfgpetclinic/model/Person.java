package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Package :  guru.springframework.sfgpetclinic.model
 * Created by jerom on 24/11/2020 at 18:19
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
}

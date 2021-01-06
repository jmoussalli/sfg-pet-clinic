package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Package :  guru.springframework.sfgpetclinic.model
 * Created by jerom on 24/11/2020 at 18:20
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

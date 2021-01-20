package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jerom on 20/01/2021 at 17:38
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}

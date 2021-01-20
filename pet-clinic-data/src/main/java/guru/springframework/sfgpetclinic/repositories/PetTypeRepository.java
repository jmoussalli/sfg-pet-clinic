package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jerom on 20/01/2021 at 17:39
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

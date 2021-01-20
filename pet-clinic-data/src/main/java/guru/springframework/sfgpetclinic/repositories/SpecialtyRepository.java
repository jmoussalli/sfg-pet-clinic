package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jerom on 20/01/2021 at 17:40
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}

package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jerom on 20/01/2021 at 17:42
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}

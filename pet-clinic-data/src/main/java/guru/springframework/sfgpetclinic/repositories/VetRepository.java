package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jerom on 20/01/2021 at 17:41
 */
@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}

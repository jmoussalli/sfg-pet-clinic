package guru.springframework.sfgpetclinic.services.map;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Package :  guru.springframework.sfgpetclinic.services.map
 * Created by jerom on 07/12/2020 at 12:40
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) { super.delete(object); }

    @Override
    public void deleteById(Long id) { super.deleteById(id); }
}

package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Package :  guru.springframework.sfgpetclinic.services.map
 * Created by jerom on 07/12/2020 at 12:44
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() { return super.findAll(); }

    @Override
    public Vet findById(Long id) { return super.findById(id); }

    @Override
    public Vet save(Vet object) { return super.save(object); }

    @Override
    public void delete(Vet object) { super.delete(object); }

    @Override
    public void deleteById(Long id) { super.deleteById(id); }
}

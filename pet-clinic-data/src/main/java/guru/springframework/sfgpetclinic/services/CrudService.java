package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Package :  guru.springframework.sfgpetclinic.services
 * Created by jerom on 05/12/2020 at 21:31
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}

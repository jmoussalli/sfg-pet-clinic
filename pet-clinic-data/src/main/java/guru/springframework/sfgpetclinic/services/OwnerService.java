package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Package :  guru.springframework.sfgpetclinic.services
 * Created by jerom on 25/11/2020 at 19:13
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

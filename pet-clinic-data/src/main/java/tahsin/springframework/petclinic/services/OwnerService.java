package tahsin.springframework.petclinic.services;

import tahsin.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}


package in.sanjeetdutt.petclinic.services;

import in.sanjeetdutt.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}

package in.sanjeetdutt.petclinic.services;

import java.util.Set;

public interface VetService {

    in.sanjeetdutt.petclinic.models.Vet findById(Long id);

    in.sanjeetdutt.petclinic.models.Vet save(in.sanjeetdutt.petclinic.models.Vet owner);

    Set<in.sanjeetdutt.petclinic.models.Vet> findAll();
}

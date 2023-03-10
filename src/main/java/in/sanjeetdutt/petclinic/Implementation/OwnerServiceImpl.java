package in.sanjeetdutt.petclinic.Implementation;

import in.sanjeetdutt.petclinic.models.Owner;
import in.sanjeetdutt.petclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceImpl extends AbstractServiceImpl<Owner, Long> implements OwnerService {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        // todo
        return null;
    }
}

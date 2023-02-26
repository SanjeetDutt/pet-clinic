package in.sanjeetdutt.petclinic.Implementation;

import in.sanjeetdutt.petclinic.models.Vet;
import in.sanjeetdutt.petclinic.services.VetService;

import java.util.Set;

public class VetServiceImpl extends AbstractServiceImpl<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

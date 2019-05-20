package tahsin.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tahsin.springframework.petclinic.model.Owner;
import tahsin.springframework.petclinic.model.Vet;
import tahsin.springframework.petclinic.services.OwnerService;
import tahsin.springframework.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Tahsin");
        owner1.setLastName("Yazkan");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Sezin");
        owner2.setLastName("Eriş Yazkan");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Hasan Tahsin");
        vet1.setLastName("Atayik");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Server");
        vet2.setLastName("Serdaroğlu");
        vetService.save(vet2);
    }
}

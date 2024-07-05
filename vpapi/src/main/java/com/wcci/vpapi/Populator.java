package com.wcci.vpapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wcci.vpapi.entity.VirtualPet;
import com.wcci.vpapi.repository.VirtualPetRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    private VirtualPetRepository virtualPetRepository;

    @Override public void run(String...args) throws Exception {
        virtualPetRepository.deleteAll();
    }

    VirtualPet pet1 = new VirtualPet("Fester", 10, 5, 20);
    VirtualPet pet2 = new VirtualPet("Lydia", 10, 5, 20);
    VirtualPet pet3 = new VirtualPet("Gomez", 10, 5, 20);
    VirtualPet pet4 = new VirtualPet("Epi", 10, 5, 20);

    virtualPetRepository.save(pet1);
    virtualPetRepository.save(pet2);
    virtualPetRepository.save(pet3);
    





}

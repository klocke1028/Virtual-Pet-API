package com.wcci.vpapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcci.vpapi.entity.VirtualPet;
import com.wcci.vpapi.repository.VirtualPetRepository;

@Service
public class VirtualPetService {
    @Autowired
    private VirtualPetRepository virtualPetRepository;

    public VirtualPet createPet(VirtualPet virtualPet) {
        return virtualPetRepository.save(virtualPet);
    }

    public List<VirtualPet> getAllPets() {
        return virtualPetRepository.findAll();
    }

    public VirtualPet getPetById(Long id) {
        return virtualPetRepository.findById(id).orElse(null);
    }

    public boolean removePet(Long id) {
        if (!virtualPetRepository.existsById(id)) {
            return false;
        }
        virtualPetRepository.deleteById(id);
        return true;
    }

}

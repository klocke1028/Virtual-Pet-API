package com.wcci.vpapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcci.vpapi.entity.VirtualPet;

@Repository
public interface VirtualPetRepository extends JpaRepository<VirtualPet, Long>{

}

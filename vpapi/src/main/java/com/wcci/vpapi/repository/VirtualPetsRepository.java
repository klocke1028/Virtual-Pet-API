package com.wcci.vpapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcci.vpapi.entity.VirtualPets;

@Repository
public interface VirtualPetsRepository extends JpaRepository<VirtualPets, Long>{

}

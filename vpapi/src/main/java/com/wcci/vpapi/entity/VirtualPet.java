package com.wcci.vpapi.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"pet\"")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class VirtualPet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pet_id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Hunger")
    private Integer hunger;

    @Column(name = "Thirst")
    private Integer thirst;

    @Column(name = "Happiness")
    private Integer happiness;

    
    private List<VirtualPet> virtualPets;

    public VirtualPet() {
        this.virtualPets = new ArrayList<>();
    }


    public VirtualPet(String name, int hunger, int thirst, int happiness){
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.happiness = happiness;
        this.virtualPets = new ArrayList<>();
    }

    public VirtualPet(String name, int hunger, int thirst, int happiness, List<VirtualPet> virtualPets) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.happiness = happiness;
        this.virtualPets = virtualPets;
    }

    public Long getNameId() {
        return id;
    }

    public void setNameId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHunger() {
        return hunger;
    }

    public void setHunger(Integer hunger) {
        this.hunger = hunger;
    }

    public Integer getThirst() {
        return thirst;
    }

    public void setThirst(Integer thirst) {
        this.thirst = thirst;
    }

    public Integer getHappiness() {
        return happiness;
    }

    public void setHappiness(Integer happiness) {
        this.happiness = happiness;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public List<VirtualPet> getVirtualPets() {
        return virtualPets;
    }


    public void setVirtualPets(List<VirtualPet> virtualPets) {
        this.virtualPets = virtualPets;
    }

    




}

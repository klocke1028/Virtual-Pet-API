package com.wcci.vpapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"pets\"")
public class VirtualPets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "name_id")
    private Long nameId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Hunger")
    private Integer hunger;

    @Column(name = "Thirst")
    private Integer thirst;

    @Column(name = "happiness")
    private Integer happiness;

    public VirtualPets(String name, int hunger, int thirst, int happiness){
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.happiness = happiness;
    }

    public Long getNameId() {
        return nameId;
    }

    public void setNameId(Long nameId) {
        this.nameId = nameId;
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

    




}

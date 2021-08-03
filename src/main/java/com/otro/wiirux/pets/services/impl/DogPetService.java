package com.otro.wiirux.pets.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.otro.wiirux.pets.services.PetService;

@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
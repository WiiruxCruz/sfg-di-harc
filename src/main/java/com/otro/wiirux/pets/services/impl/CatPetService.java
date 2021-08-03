package com.otro.wiirux.pets.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.otro.wiirux.pets.services.PetService;

@Service
@Profile("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}

package com.otro.wiirux.pets.services;

import com.otro.wiirux.pets.services.impl.CatPetService;
import com.otro.wiirux.pets.services.impl.DogPetService;

public class PetServiceFactory {
	public PetService getPetService(String petType) {
		switch(petType) {
			case "dog":
				return new DogPetService();
			case "cat":
				return new CatPetService();
			default:
				return new DogPetService();
		}
	}
}

package mx.com.wiirux.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import com.otro.wiirux.pets.services.PetService;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
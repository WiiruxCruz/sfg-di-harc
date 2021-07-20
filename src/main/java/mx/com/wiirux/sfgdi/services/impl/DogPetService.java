package mx.com.wiirux.sfgdi.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import mx.com.wiirux.sfgdi.services.PetService;

@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
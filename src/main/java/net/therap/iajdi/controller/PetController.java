package net.therap.iajdi.controller;

import net.therap.iajdi.service.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService){
        this.petService=petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}

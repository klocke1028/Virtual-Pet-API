package come.wcci.vpapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.vpapi.entity.VirtualPet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.wcci.vpapi.service.VirtualPetService;


@RestController
@RequestMapping("/api/virtualpets")
public class VirtualPetController {

    @Autowired
    private VirtualPetService virtualPetService;

    public ResponseEntity<VirtualPet> addPet(@RequestBody VirtualPet virtualPet) {
        VirtualPet newPet = virtualPetService.createPet(virtualPet);
        return new ResponseEntity<>(newPet, HttpStatus.CREATED);
    }
    
    
    }
    



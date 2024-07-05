package come.wcci.vpapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.vpapi.entity.VirtualPet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.wcci.vpapi.service.VirtualPetService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/virtualpets")
public class VirtualPetController {

    @Autowired
    private VirtualPetService virtualPetService;

    @PostMapping
    public ResponseEntity<VirtualPet> addPet(@RequestBody VirtualPet virtualPet) {
        VirtualPet createdPet = virtualPetService.createPet(virtualPet);
        return new ResponseEntity<>(createdPet, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> removePet(@PathVariable Long id) {
        boolean isRemoved = virtualPetService.removePet(id);
        if (!isRemoved) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<VirtualPet>> findAllPets() {
        List<VirtualPet> virtualPets = virtualPetService.getAllPets();
        return ResponseEntity.ok(virtualPets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VirtualPet> findPetById(@PathVariable Long id) {
        VirtualPet foundPet = virtualPetService.getPetById(id);
        if (foundPet == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(foundPet);
    }

}

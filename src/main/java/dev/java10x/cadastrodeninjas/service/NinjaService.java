package dev.java10x.cadastrodeninjas.service;

import dev.java10x.cadastrodeninjas.NinjaRepository;
import dev.java10x.cadastrodeninjas.model.Ninja;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> getAllNinjas() {
        return ninjaRepository.findAll();
    }


    public ResponseEntity<Object> getNinjaById(Long id) {
        Optional<Ninja> ninja = ninjaRepository.findById(id);

        if (ninja.isPresent()) {
            return ResponseEntity.ok(ninja.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja not found with id: " + id);
        }
    }


    public Ninja saveNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
}
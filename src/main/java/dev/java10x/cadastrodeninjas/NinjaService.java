package dev.java10x.cadastrodeninjas;

import dev.java10x.cadastrodeninjas.model.Ninja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
        return ninja.<ResponseEntity<Object>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(404).body("Ninja not found"));
    }

    public Ninja saveNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

}

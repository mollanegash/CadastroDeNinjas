package dev.java10x.cadastrodeninjas;

import dev.java10x.cadastrodeninjas.model.Ninja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class Controller {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem";
    }

    @GetMapping
    public List<Ninja> getAll() {
        return ninjaService.getAllNinjas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getNinjaById(@PathVariable Long id) {
        return ninjaService.getNinjaById(id);
    }

    @PostMapping
    public Ninja add(@RequestBody Ninja ninja) {
        return ninjaService.saveNinja(ninja);
    }
}
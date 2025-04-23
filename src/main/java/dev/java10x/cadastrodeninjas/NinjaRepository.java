package dev.java10x.cadastrodeninjas;

import dev.java10x.cadastrodeninjas.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
package fca.cafeteria.repository;

import fca.cafeteria.data.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {
    Optional<Bebida> findByNombre(String nombre);
}
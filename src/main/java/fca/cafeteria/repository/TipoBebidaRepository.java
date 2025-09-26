package fca.cafeteria.repository;

import fca.cafeteria.data.TipoBebida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TipoBebidaRepository extends JpaRepository<TipoBebida, Long> {
    Optional<TipoBebida> findByDescripcion(String descripcion);
}

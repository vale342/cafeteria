package fca.cafeteria.repository;

import fca.cafeteria.data.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {
    List<Bebida> findByNombre(String nombre);
}
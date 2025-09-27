package fca.cafeteria.domain;

import fca.cafeteria.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoService {

    @Autowired
    private BebidaRepository bebidaRepository;

    @Autowired
    private TipoBebidaRepository tipoBebidaRepository;

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @Autowired
    private BebidaIngredienteRepository bebidaIngredienteRepository;

    // Registrar bebida con validación de tipo
    public Bebida registrarBebida(Bebida bebida) {
        if (bebida.getTipoBebida() == null || bebida.getTipoBebida().getId() == null) {
            throw new IllegalArgumentException("Tipo de bebida no especificado");
        }

        boolean existeTipo = tipoBebidaRepository.existsById(bebida.getTipoBebida().getId());
        if (!existeTipo) {
            throw new IllegalArgumentException("Tipo de bebida no existe");
        }

        return bebidaRepository.save(bebida);
    }

    // Verificar si existe tipo de bebida
    public boolean existeTipoBebida(Long id) {
        return tipoBebidaRepository.existsById(id);
    }

    // Guardar bebida sin validación
    public Bebida guardarBebida(Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    // Guardar tipo de bebida
    public TipoBebida guardarTipo(TipoBebida tipo) {
        return tipoBebidaRepository.save(tipo);
    }

    // Guardar ingrediente
    public Ingrediente guardarIngrediente(Ingrediente ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

    // Asociar ingrediente a bebida
    public BebidaIngrediente asociarIngrediente(BebidaIngrediente bi) {
        return bebidaIngredienteRepository.save(bi);
    }
}
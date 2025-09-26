package fca.cafeteria.domain;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.repository.BebidaRepository;
import fca.cafeteria.repository.TipoBebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoService implements ICatalogoService {

    @Autowired
    private BebidaRepository bebidaRepository;

    @Autowired
    private TipoBebidaRepository tipoBebidaRepository;

    @Override
    public boolean registrarBebida(String nombre, String descripcion, String tipoDescripcion) {
        if (bebidaExiste(nombre)) return false;

        TipoBebida tipo;
        if (tipoBebidaExiste(tipoDescripcion)) {
            tipo = tipoBebidaRepository.findByDescripcion(tipoDescripcion).get();
        } else {
            tipo = guardarTipoBebida(tipoDescripcion);
        }

        guardarBebida(nombre, descripcion, tipo);
        return true;
    }

    @Override
    public boolean bebidaExiste(String nombre) {
        return bebidaRepository.findByNombre(nombre).isPresent();
    }

    @Override
    public boolean tipoBebidaExiste(String descripcion) {
        return tipoBebidaRepository.findByDescripcion(descripcion).isPresent();
    }

    @Override
    public TipoBebida guardarTipoBebida(String descripcion) {
        TipoBebida tipo = new TipoBebida();
        tipo.setDescripcion(descripcion);
        return tipoBebidaRepository.save(tipo);
    }

    @Override
    public Bebida guardarBebida(String nombre, String descripcion, TipoBebida tipoBebida) {
        Bebida bebida = new Bebida();
        bebida.setNombre(nombre);
        bebida.setDescripcion(descripcion);
        bebida.setTipoBebida(tipoBebida);
        return bebidaRepository.save(bebida);
    }

    @Override
    public List<Bebida> obtenerTodasLasBebidas() {
        return bebidaRepository.findAll();
    }
}

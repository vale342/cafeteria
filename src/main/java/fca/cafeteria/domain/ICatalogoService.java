package fca.cafeteria.domain;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.TipoBebida;

import java.util.List;

public interface ICatalogoService {
    boolean registrarBebida(String nombre, String descripcion, String tipoDescripcion);
    boolean bebidaExiste(String nombre);
    boolean tipoBebidaExiste(String descripcion);
    TipoBebida guardarTipoBebida(String descripcion);
    Bebida guardarBebida(String nombre, String descripcion, TipoBebida tipoBebida);
    List<Bebida> obtenerTodasLasBebidas();
}

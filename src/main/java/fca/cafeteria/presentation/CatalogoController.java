package fca.cafeteria.presentation;

import fca.cafeteria.domain.ICatalogoService;
import fca.cafeteria.data.Bebida;
import fca.cafeteria.dto.BebidaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    private ICatalogoService catalogoService;

    @PostMapping("/bebida")
    public String registrarBebida(@RequestBody BebidaDTO bebidaDTO) {
        boolean resultado = catalogoService.registrarBebida(
                bebidaDTO.getNombre(),
                bebidaDTO.getDescripcion(),
                bebidaDTO.getTipo()
        );
        return resultado ? "bebidaagregada" : "yaexiste";
    }

    @GetMapping("/bebidas")
    public List<Bebida> getAllBebidas() {
        return catalogoService.obtenerTodasLasBebidas();
    }
}

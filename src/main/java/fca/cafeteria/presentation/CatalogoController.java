package fca.cafeteria.presentation;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.BebidaIngrediente;
import fca.cafeteria.data.Ingrediente;
import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.domain.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {

    @Autowired
    private CatalogoService catalogoService;

    @PostMapping("/registrarBebida")
    public ResponseEntity<Bebida> registrarBebida(@RequestBody Bebida bebida) {
        Bebida bebidaGuardada = catalogoService.registrarBebida(bebida);
        return ResponseEntity.ok(bebidaGuardada);
    }

    @GetMapping("/existeTipoBebida/{id}")
    public ResponseEntity<Boolean> existeTipoBebida(@PathVariable Long id) {
        return ResponseEntity.ok(catalogoService.existeTipoBebida(id));
    }

    @PostMapping("/guardarBebida")
    public ResponseEntity<Bebida> guardarBebida(@RequestBody Bebida bebida) {
        return ResponseEntity.ok(catalogoService.guardarBebida(bebida));
    }

    @PostMapping("/guardarTipo")
    public ResponseEntity<TipoBebida> guardarTipo(@RequestBody TipoBebida tipo) {
        return ResponseEntity.ok(catalogoService.guardarTipo(tipo));
    }

    @PostMapping("/guardarIngrediente")
    public ResponseEntity<Ingrediente> guardarIngrediente(@RequestBody Ingrediente ingrediente) {
        return ResponseEntity.ok(catalogoService.guardarIngrediente(ingrediente));
    }

    @PostMapping("/asociarIngrediente")
    public ResponseEntity<BebidaIngrediente> asociarIngrediente(@RequestBody BebidaIngrediente bi) {
        return ResponseEntity.ok(catalogoService.asociarIngrediente(bi));
    }
}

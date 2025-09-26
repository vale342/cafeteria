package fca.cafeteria.data;

import jakarta.persistence.*;
        import lombok.Data;

@Entity
@Table(name = "tIngrediente")
@Data
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Float costo;
}

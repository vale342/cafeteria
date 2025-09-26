package fca.cafeteria.data;

import jakarta.persistence.*;
        import lombok.Data;

@Entity
@Table(name = "tBebidaIngrediente")
@Data
public class BebidaIngrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBebidaIngrediente;

    @ManyToOne
    @JoinColumn(name = "idBebida")
    private Bebida bebida;

    @ManyToOne
    @JoinColumn(name = "idIngrediente")
    private Ingrediente ingrediente;

    private Integer cantidad;
}

package fca.cafeteria.data;

import jakarta.persistence.*;
        import lombok.Data;

@Entity
@Table(name = "tbebida")
@Data
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idTipoBebida")
    private TipoBebida tipoBebida;
}

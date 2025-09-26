package fca.cafeteria.data;

import jakarta.persistence.*;
        import lombok.Data;

@Entity
@Table(name = "tTipoBebida")
@Data
public class TipoBebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
}

package fca.cafeteria.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tTipoBebida")
public class TipoBebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
}


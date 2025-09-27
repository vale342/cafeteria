package fca.cafeteria.data;

import jakarta.persistence.*;

import javax.net.ssl.SSLSession;

@Entity
@Table(name = "tBebida")
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idTipoBebida")
    private TipoBebida tipoBebida;

    public SSLSession getTipoBebida() {
        return null;
    }
}

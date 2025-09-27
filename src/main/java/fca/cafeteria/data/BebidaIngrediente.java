package fca.cafeteria.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tBebidaIngrediente")
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

    public BebidaIngrediente() {}

    public Long getIdBebidaIngrediente() {
        return idBebidaIngrediente;
    }

    public void setIdBebidaIngrediente(Long idBebidaIngrediente) {
        this.idBebidaIngrediente = idBebidaIngrediente;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}

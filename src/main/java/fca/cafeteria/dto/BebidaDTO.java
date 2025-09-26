package fca.cafeteria.dto;

public class BebidaDTO {
    private String nombre;
    private String descripcion;
    private String tipo;

    // Constructor vacío (requerido por Spring)
    public BebidaDTO() {}

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
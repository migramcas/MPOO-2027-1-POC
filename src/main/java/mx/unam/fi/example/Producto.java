package mx.unam.fi.example;

import java.time.LocalDate;

public class Producto {

    private String codigo;
    private String nombre;
    private LocalDate fechaCaducidad;
    private CategoriaProducto categoria;

    private Producto(Builder builder) {
        this.codigo = builder.codigo;
        this.nombre = builder.nombre;
        this.fechaCaducidad = builder.fechaCaducidad;
        this.categoria = builder.categoria;
    }

    public static class Builder {

        private String codigo;
        private String nombre;
        private LocalDate fechaCaducidad;
        private CategoriaProducto categoria;

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder setCodigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setFechaCaducidad(LocalDate fechaCaducidad) {
            this.fechaCaducidad = fechaCaducidad;
            return this;
        }

        public Builder setCategoria(CategoriaProducto categoria) {
            this.categoria = categoria;
            return this;
        }

        public Producto build() {
            return new Producto(this);
        }

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
}

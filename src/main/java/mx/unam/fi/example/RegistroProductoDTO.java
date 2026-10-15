package mx.unam.fi.example;

import java.time.LocalDate;

class RegistroProductoDTO {

    private final String codigo;
    private final String nombre;
    private final LocalDate fechaCaducidad;
    private final CategoriaProducto categoria;
    private final double precio;


    public RegistroProductoDTO(
            String codigo,
            String nombre,
            LocalDate fechaCaducidad,
            CategoriaProducto categoria,
            double precio
    ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.categoria = categoria;
        this.precio = precio;
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


    public double getPrecio() {
        return precio;
    }
}
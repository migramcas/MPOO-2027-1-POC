package mx.unam.fi.example;

class ReabastecimientoDTO {

    private final String codigo;
    private final int cantidad;


    public ReabastecimientoDTO(
            String codigo,
            int cantidad
    ) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }


    public String getCodigo() {
        return codigo;
    }


    public int getCantidad() {
        return cantidad;
    }
}
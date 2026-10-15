package mx.unam.fi.example;

class CompraDTO {

    private final String codigoProducto;
    private final double cantidadRecibida;


    public CompraDTO(
            String codigoProducto,
            double cantidadRecibida
    ) {
        this.codigoProducto = codigoProducto;
        this.cantidadRecibida = cantidadRecibida;
    }


    public String getCodigoProducto() {
        return codigoProducto;
    }


    public double getCantidadRecibida() {
        return cantidadRecibida;
    }
}

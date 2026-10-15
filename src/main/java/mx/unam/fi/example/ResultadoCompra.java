package mx.unam.fi.example;

class ResultadoCompra {

    private final EstadoCompra estado;
    private final Producto producto;
    private final double cambio;


    public ResultadoCompra(
            EstadoCompra estado,
            Producto producto,
            double cambio
    ) {
        this.estado = estado;
        this.producto = producto;
        this.cambio = cambio;
    }


    public EstadoCompra getEstado() {
        return estado;
    }


    public Producto getProducto() {
        return producto;
    }


    public double getCambio() {
        return cambio;
    }
}

package mx.unam.fi.example;

class ProductoInventario {

    private final Producto producto;
    private final double precio;
    private final int existencias;

    public ProductoInventario(
            Producto producto,
            double precio,
            int existencias
    ) {
        this.producto = producto;
        this.precio = precio;
        this.existencias = existencias;
    }


    public Producto getProducto() {
        return producto;
    }


    public double getPrecio() {
        return precio;
    }


    public int getExistencias() {
        return existencias;
    }
}

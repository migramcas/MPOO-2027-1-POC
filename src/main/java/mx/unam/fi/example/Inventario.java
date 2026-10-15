package mx.unam.fi.example;

import java.util.Optional;

interface Inventario {

    ResultadoRegistro registrarProducto(
            Producto producto,
            double precio
    );

    Optional<ProductoInventario> buscarProducto(
            String codigo
    );

    ResultadoReabastecimiento reabastecer(
            String codigo,
            int cantidad
    );

    ResultadoEntrega despachar(
            String codigo
    );
}

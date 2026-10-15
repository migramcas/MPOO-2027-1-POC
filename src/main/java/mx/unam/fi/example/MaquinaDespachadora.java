package mx.unam.fi.example;

import java.util.Optional;

interface MaquinaDespachadora {

    ResultadoRegistro registrarProducto(
            RegistroProductoDTO producto
    );

    Optional<ProductoInventario> buscarProducto(
            String codigo
    );

    ResultadoReabastecimiento reabastecer(
            ReabastecimientoDTO solicitud
    );

    ResultadoCompra comprar(
            CompraDTO solicitud
    );

    double consultarFondos();
}
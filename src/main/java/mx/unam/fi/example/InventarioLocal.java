package mx.unam.fi.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InventarioLocal implements Inventario {

    private final Map<String, ProductoInventario> inventario;

    public InventarioLocal() {
        this.inventario = new HashMap<>();
    }

    @Override
    public ResultadoRegistro registrarProducto(Producto producto, double precio) {
        inventario.put(producto.getCodigo(), new ProductoInventario(producto, precio, 0));
        return null;
    }

    @Override
    public Optional<ProductoInventario> buscarProducto(String codigo) {
        if (!inventario.containsKey(codigo)) {
            return Optional.empty();
        }
        return Optional.of(inventario.get(codigo));
    }

    @Override
    public ResultadoReabastecimiento reabastecer(String codigo, int cantidad) {
        ProductoInventario infoProducto = inventario.get(codigo);
        if(infoProducto == null) {
            return ResultadoReabastecimiento.PRODUCTO_NO_ENCONTRADO;
        }

        if(cantidad <= 0) {
            return ResultadoReabastecimiento.CANTIDAD_INVALIDA;
        }

        ProductoInventario productoReabastecido = new ProductoInventario(
                infoProducto.getProducto(), infoProducto.getPrecio(), cantidad);
        inventario.put(codigo, productoReabastecido);
        return ResultadoReabastecimiento.REABASTECIMIENTO_REALIZADO;
    }

    @Override
    public ResultadoEntrega despachar(String codigo) {
        return null;
    }

}

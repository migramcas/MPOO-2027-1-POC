package mx.unam.fi.example;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Producto nuevoProducto = Producto.Builder.newBuilder()
                .setCodigo("123")
                .setNombre("Coca Cola")
                .setFechaCaducidad(LocalDate.of(2024, 12, 31))
                .setCategoria(CategoriaProducto.BEBIDA)
                .build();

        MonederoDineroFisico monedero = new MonederoDineroFisico(1000);
        InventarioLocal inventario = new InventarioLocal();

        MaquinaDespachadora maquinaFacultadIngenieria = MaquinaDespachadoraImpl.Builder
                .newBuilder()
                .setMonedero(monedero)
                .setInventario(inventario)
                .build();

        maquinaFacultadIngenieria.registrarProducto(new RegistroProductoDTO(
                nuevoProducto.getCodigo(),
                nuevoProducto.getNombre(),
                nuevoProducto.getFechaCaducidad(),
                nuevoProducto.getCategoria(),
                20.0
        ));

        System.out.println("CODIGO PRODUCTO => " + nuevoProducto.getCodigo());
    }
}

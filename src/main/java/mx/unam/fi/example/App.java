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

        System.out.println("CODIGO PRODUCTO => " + nuevoProducto.getCodigo());
    }
}

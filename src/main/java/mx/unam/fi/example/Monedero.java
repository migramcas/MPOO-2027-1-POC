package mx.unam.fi.example;

interface Monedero {

    ResultadoCobro cobrar(
            double precio,
            double cantidadRecibida
    );

    double consultarFondos();
}
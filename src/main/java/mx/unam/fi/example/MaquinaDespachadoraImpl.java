package mx.unam.fi.example;

import java.util.Optional;

public class MaquinaDespachadoraImpl implements  MaquinaDespachadora {

    private final Monedero monedero;
    private final Inventario inventario;

    public MaquinaDespachadoraImpl(Builder builder) {
        this.monedero = builder.monedero;
        this.inventario = builder.inventario;
    }

    public static class Builder {

        private Monedero monedero;
        private Inventario inventario;

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder setMonedero(Monedero monedero) {
            this.monedero = monedero;
            return this;
        }

        public Builder setInventario(Inventario inventario) {
            this.inventario = inventario;
            return this;
        }

        public MaquinaDespachadoraImpl build() {
            return new MaquinaDespachadoraImpl(this);
        }

    }

    @Override
    public ResultadoRegistro registrarProducto(RegistroProductoDTO producto) {
        return null;
    }

    @Override
    public Optional<ProductoInventario> buscarProducto(String codigo) {
        return Optional.empty();
    }

    @Override
    public ResultadoReabastecimiento reabastecer(ReabastecimientoDTO solicitud) {
        return null;
    }

    @Override
    public ResultadoCompra comprar(CompraDTO solicitud) {
        return null;
    }

    @Override
    public double consultarFondos() {
        return monedero.consultarFondos();
    }


}

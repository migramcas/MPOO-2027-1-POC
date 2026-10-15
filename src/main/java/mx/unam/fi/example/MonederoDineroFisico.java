package mx.unam.fi.example;

public class MonederoDineroFisico implements Monedero {

    private double fondos;

    public MonederoDineroFisico(double fondos) {
        this.fondos = fondos;
    }

    @Override
    public ResultadoCobro cobrar(double precio, double cantidadRecibida) {
        if(cantidadRecibida > fondos) {}
        return null;
    }

    @Override
    public double consultarFondos() {
        return 0;
    }

}

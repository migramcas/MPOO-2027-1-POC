package mx.unam.fi.example;

class ResultadoCobro {

    private final EstadoCobro estado;
    private final double cambio;

    public ResultadoCobro(
            EstadoCobro estado,
            double cambio
    ) {
        this.estado = estado;
        this.cambio = cambio;
    }


    public EstadoCobro getEstado() {
        return estado;
    }


    public double getCambio() {
        return cambio;
    }
}
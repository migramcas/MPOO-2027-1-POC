package mx.unam.fi.example.domain;

import java.time.LocalDate;

abstract public class Reembolso {

    private String folio;
    private String empleado;
    private double monto;
    private LocalDate fechaGasto;
    private boolean tieneComprobante;
    private boolean autorizadoGerente;

    public Reembolso(String folio, String empleado, double monto, LocalDate fechaGasto, boolean tieneComprobante, boolean autorizadoGerente) {
        this.folio = folio;
        this.empleado = empleado;
        this.monto = monto;
        this.fechaGasto = fechaGasto;
        this.tieneComprobante = tieneComprobante;
        this.autorizadoGerente = autorizadoGerente;
    }

    public Reembolso(double monto, LocalDate fechaGasto, boolean tieneComprobante, boolean autorizadoGerente) {
        this.monto = monto;
        this.fechaGasto = fechaGasto;
        this.tieneComprobante = tieneComprobante;
        this.autorizadoGerente = autorizadoGerente;
    }

    public String getFolio() {
        return folio;
    }

    public String getEmpleado() {
        return empleado;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFechaGasto() {
        return fechaGasto;
    }

    public boolean isTieneComprobante() {
        return tieneComprobante;
    }

    public boolean isAutorizadoGerente() {
        return autorizadoGerente;
    }

    public abstract double getLimitePermitido();
}

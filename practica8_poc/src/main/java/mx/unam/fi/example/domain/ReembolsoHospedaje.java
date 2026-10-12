package mx.unam.fi.example.domain;

import java.time.LocalDate;

public class ReembolsoHospedaje extends  Reembolso {

    public ReembolsoHospedaje(String folio, String empleado, double monto, LocalDate fechaGasto, boolean tieneComprobante, boolean autorizadoGerente) {
        super(folio, empleado, monto, fechaGasto, tieneComprobante, autorizadoGerente);
    }

    @Override
    public double getLimitePermitido() {
        return 4000;
    }

}

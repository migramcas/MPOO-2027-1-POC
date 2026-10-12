package mx.unam.fi.example.domain;

public class RegistroHospedaje extends RegistroReembolso {

    public RegistroHospedaje() {
    }

    @Override
    protected Reembolso crear(ReembolsoInputDTO dto) {
        return new ReembolsoHospedaje(dto.getFolio(), dto.getEmpleado(), dto.getMonto(), dto.getFechaGasto(), dto.tieneComprobante(), dto.estaAutorizadoGerente());
    }
}

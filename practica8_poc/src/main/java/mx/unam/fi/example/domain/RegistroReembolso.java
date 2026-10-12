package mx.unam.fi.example.domain;

public abstract class RegistroReembolso {

    public  Reembolso registrar(ReembolsoInputDTO reembolsoInputDTO) {
        return crear(reembolsoInputDTO);
    }

    protected abstract Reembolso crear(ReembolsoInputDTO dto);

}

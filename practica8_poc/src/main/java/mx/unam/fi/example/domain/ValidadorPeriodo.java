package mx.unam.fi.example.domain;

public class ValidadorPeriodo extends ValidadorReembolso {
    @Override
    public ResultadoValidacion validate(Reembolso reembolso) {
        System.out.println("Validando periodo");

        if(reembolso.getFechaGasto() == null) {
            return ResultadoValidacion.FUERA_DE_PERIODO;
        }

        return validateNext(reembolso);
    }
}

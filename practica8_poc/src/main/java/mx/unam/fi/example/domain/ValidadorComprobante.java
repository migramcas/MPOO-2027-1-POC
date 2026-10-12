package mx.unam.fi.example.domain;

public class ValidadorComprobante extends ValidadorReembolso {

    @Override
    public ResultadoValidacion validate(Reembolso reembolso) {
        System.out.println("Validando comprobante");

        if(!reembolso.isTieneComprobante()){
            return ResultadoValidacion.SIN_COMPROBANTE;
        }

        return validateNext(reembolso);
    }

}

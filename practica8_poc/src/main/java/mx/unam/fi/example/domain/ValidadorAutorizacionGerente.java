package mx.unam.fi.example.domain;

public class ValidadorAutorizacionGerente extends ValidadorReembolso {

    @Override
    public ResultadoValidacion validate(Reembolso reembolso) {
        System.out.println("Validando autorización del gerente");

        if(!reembolso.isAutorizadoGerente()){
            return ResultadoValidacion.REQUIERE_AUTORIZACION;
        }

        return validateNext(reembolso);
    }

}

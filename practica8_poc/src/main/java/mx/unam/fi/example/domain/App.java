package mx.unam.fi.example.domain;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        ReembolsoInputDTO dto = new ReembolsoInputDTO(
                TipoReembolso.HOSPEDAJE,
                "F123",
                "Juan Perez",
                1000.0,
                LocalDate.now(),
                true,
                true,
                LocalDate.now());

        RegistroReembolso registroReembolso = null;

        switch(dto.getTipo()) {
            case HOSPEDAJE:
                registroReembolso = new RegistroHospedaje();
                break;
            //Registro de otros tipos de reembolso....
        }

        Reembolso reembolso = registroReembolso.registrar(dto);


        ValidadorReembolso validadorComprobante = new ValidadorComprobante();
        ValidadorReembolso validadorAutorizacionGerente = new ValidadorAutorizacionGerente();
        ValidadorReembolso validadorPeriodo = new ValidadorPeriodo();


        validadorComprobante
                .setNext(validadorAutorizacionGerente)
                .setNext(validadorPeriodo);


        ResultadoValidacion resultado = validadorComprobante.validate(reembolso);
        System.out.println("Resultado de la validacion: " + resultado);
    }

}

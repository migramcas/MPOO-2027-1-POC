package mx.unam.fi.example.domain;

public abstract class ValidadorReembolso {

    protected ValidadorReembolso next;

    public ValidadorReembolso setNext(ValidadorReembolso next) {
        this.next = next;
        return next;
    }

    protected final ResultadoValidacion validateNext(Reembolso reembolso) {
        return next != null ? next.validate(reembolso) : ResultadoValidacion.APROBADO;
    }

    public abstract ResultadoValidacion validate(Reembolso reembolso);
}

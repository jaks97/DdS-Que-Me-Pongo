public class AtuendoException extends RuntimeException {
    public AtuendoException() {
        super("La composicion del atuendo no es valida (no coinciden los tipos de prenda con lo esperado)");
    }
}
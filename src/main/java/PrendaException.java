public class PrendaException extends RuntimeException {
    public PrendaException() {
        super("Le faltan elementos a la prenda (tipo, material o color)");
    }
}

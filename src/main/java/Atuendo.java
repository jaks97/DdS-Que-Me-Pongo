import java.util.List;

public class Atuendo {
    private Prenda superior;
    private Prenda inferior;
    private Prenda calzado;
    private List<Prenda> accesorios; // Puede tene varios y no es obligatorio que un atuendo lleve accesorios

    public Atuendo(Prenda superior, Prenda inferior, Prenda calzado, List<Prenda> accesorios) {
        this(superior, inferior, calzado);

        if(!accesorios.stream()
                .allMatch((Prenda accesorio) -> accesorio.getCategoria() == CategoriaPrenda.ACCESORIO))
            throw new AtuendoException();

        this.accesorios = accesorios;
    }

    public Atuendo(Prenda superior, Prenda inferior, Prenda calzado) {
        if (superior.getCategoria() != CategoriaPrenda.SUPERIOR
            || inferior.getCategoria() != CategoriaPrenda.INFERIOR
            || calzado.getCategoria() != CategoriaPrenda.CALZADO)
            throw new AtuendoException();

        this.superior = superior;
        this.inferior = inferior;
        this.calzado = calzado;
    }

    public Prenda getSuperior() {
        return superior;
    }

    public Prenda getInferior() {
        return inferior;
    }

    public Prenda getCalzado() {
        return calzado;
    }

    public List<Prenda> getAccesorios() {
        return accesorios;
    }
}

import java.util.List;

public class Guardarropas {
    private List<Prenda> prendas;

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    public void addPrenda(Prenda prenda) {
        prendas.add(prenda);
    }

    public void removePrenda(Prenda prenda) {
        prendas.remove(prenda);
    }
}

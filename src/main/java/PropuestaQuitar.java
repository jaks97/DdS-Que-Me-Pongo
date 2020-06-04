public class PropuestaQuitar implements Propuesta {
    private Guardarropas guardarropas; // El guardarropas donde se va a agregar la prenda
    private Prenda prenda; // La prenda que se va a agregar

    public PropuestaQuitar(Guardarropas guardarropas, Prenda prenda) {
        this.guardarropas = guardarropas;
        this.prenda = prenda;
    }

    @Override
    public void aceptarPropuesta() {
        guardarropas.removePrenda(prenda);
    }

    @Override
    public void rechazarPropuesta() {
        // TODO: Algo pasara supongo
    }

    @Override
    public void deshacerPropuesta() {
        guardarropas.addPrenda(prenda);
    }
}

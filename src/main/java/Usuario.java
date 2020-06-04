import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private Ciudad ciudad;
    private List<Guardarropas> guardarropas;

    private List<Atuendo> generarSugerenciaSegunClima() {
        Clima clima = getCiudad().getClimaActual();

        List<Prenda> prendasAptas = getGuardarropas().stream().filter((Prenda prenda) -> prenda.aptaParaTemperatura(clima.getTemperatura()));

        List<Atuendo> sugerencias = new ArrayList<>();

        /*
         * TODO: Se deberian crear las sugerencias de alguna forma usando la lista de prendas aptas
         */

        return sugerencias;
    }

    public void setGuardarropas(List<Guardarropas> guardarropas) {
        this.guardarropas = guardarropas;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public List<Guardarropas> getGuardarropas() {
        return guardarropas;
    }
}

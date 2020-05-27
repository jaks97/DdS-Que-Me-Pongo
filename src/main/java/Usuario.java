import java.util.ArrayList;
import java.util.List;

public class Usuario {
    Ciudad ciudad;
    List<Prenda> guardarropas;

    private List<Atuendo> generarSugerenciaSegunClima() {
        Clima clima = ciudad.getClimaActual();

        List<Prenda> prendasAptas = guardarropas.stream().filter((Prenda prenda) -> prenda.aptaParaTemperatura(clima.getTemperatura()));

        List<Atuendo> sugerencias = new ArrayList<>();

        /*
         * TODO: Se deberian crear las sugerencias de alguna forma usando la lista de prendas aptas
         */

        return sugerencias;
    }
}

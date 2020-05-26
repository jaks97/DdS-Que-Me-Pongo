import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimaProviderAccuWeather implements ClimaProvider {
    private AccuWeatherAPI apiClima = new AccuWeatherAPI();

    private Map<String, Object> obtenerCondicionesClimaticas(String ciudad, Integer hora){
        return  apiClima.getWeather(ciudad).get(hora);
    }

    @Override
    public Clima getClima(String ciudad) {
        Map<String, Object> condicionesClimaticas = obtenerCondicionesClimaticas(ciudad, 0);

        Integer temperatura = condicionesClimaticas.get("Temperature").get("Value");
        Float probabilidadLluvia = condicionesClimaticas.get("PrecipitationProbability");

        return new Clima(temperatura, probabilidadLluvia);
    }
}
import java.time.LocalDateTime;

public class Clima {
    private LocalDateTime fecha; // El momento al que corresponde este reporte del clima

    // Por ahora solo manejo la temperatura, porque es lo que usamos.
    // En el futuro seguramente haga falta tener mas cualidades del clima.
    private Integer temperatura;
    private Float probabilidadLluvia;

    public Clima(Integer temperatura, Float probabilidadLluvia) {
        this.temperatura = temperatura;
        this.probabilidadLluvia = probabilidadLluvia;
        this.fecha = LocalDateTime.now();
    }
    public Integer getTemperatura() {
        return temperatura;
    }

    public Float getProbabilidadLluvia() {
        return probabilidadLluvia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}

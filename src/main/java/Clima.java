public class Clima {

    // Por ahora solo manejo la temperatura, porque es lo que usamos.
    // En el futuro seguramente haga falta tener mas cualidades del clima.
    private Integer temperatura;
    private Float probabilidadLluvia;

    public Clima(Integer temperatura, Float probabilidadLluvia) {
        this.temperatura = temperatura;
        this.probabilidadLluvia = probabilidadLluvia;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public Float getProbabilidadLluvia() {
        return probabilidadLluvia;
    }
}

import java.time.LocalDateTime;

public class Ciudad {
    private String nombre;
    private Clima clima;
    private ClimaProvider proveedorClima;

    public String getNombre() {
        return nombre;
    }

    public Clima getClimaActual() {
        // Si el clima es muy viejo, actualizamos
        if(clima == null || clima.getFecha().getHour() - LocalDateTime.now().getHour() < 1)
            clima = proveedorClima.getClima(nombre);

        return clima;
    }
}

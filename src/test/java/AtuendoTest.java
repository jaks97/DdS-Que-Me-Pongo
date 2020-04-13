import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AtuendoTest {

    Prenda camisa;
    Prenda pantalon;
    Prenda zapato;
    Prenda anteojo;

    @Before
    public void initialize() {
        // Creo algunas prendas
        camisa = new Prenda(Tipo.CAMISA, Prenda.Material.ALGODON, Prenda.Color.AZUL);
        pantalon = new Prenda(Tipo.PANTALON, Prenda.Material.JEAN, Prenda.Color.AZUL);
        zapato = new Prenda(Tipo.ZAPATO, Prenda.Material.CUERO, Prenda.Color.NEGRO);
        anteojo = new Prenda(Tipo.ANTEOJOS, Prenda.Material.METAL, Prenda.Color.NEGRO);
    }

    @Test
    public void testAtuendo() {
        Atuendo atuendo = new Atuendo(camisa, pantalon, zapato, Arrays.asList(anteojo));

        assertEquals(camisa, atuendo.getSuperior());
        assertEquals(pantalon, atuendo.getInferior());
        assertEquals(zapato, atuendo.getCalzado());
        assertEquals(Arrays.asList(anteojo), atuendo.getAccesorios());
    }

    @Test
    public void testAtuendoInvalido() {
        // Pongo una camisa como prenda inferior
        assertThrows(AtuendoException.class, () -> new Atuendo(camisa, camisa, zapato));
        // Y un pantalon como superior
        assertThrows(AtuendoException.class, () -> new Atuendo(pantalon, pantalon, zapato));
        // O un anteojo como zapato
        assertThrows(AtuendoException.class, () -> new Atuendo(camisa, pantalon, anteojo));
        // O una camisa como accesorio
        assertThrows(AtuendoException.class, () -> new Atuendo(camisa, pantalon, zapato, Arrays.asList(anteojo, camisa)));
    }
}
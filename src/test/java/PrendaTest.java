import org.junit.Test;

import static org.junit.Assert.*;

public class PrendaTest {
    @Test
    public void testPrenda() {
        Prenda prenda = new Prenda(Tipo.CAMISA, Prenda.Material.ALGODON, Prenda.Color.AZUL, Prenda.Color.NEGRO);

        assertEquals(Tipo.CAMISA, prenda.getTipo());
        assertEquals(CategoriaPrenda.SUPERIOR, prenda.getCategoria());
        assertEquals(Prenda.Material.ALGODON, prenda.getMaterial());
        assertEquals(Prenda.Color.AZUL, prenda.getColor());
        assertEquals(Prenda.Color.NEGRO, prenda.getColorSecundario());
    }

    @Test
    public void testPrendaInvalida() {
        // Armo prendas con distintos faltantes
        assertThrows(PrendaException.class, () -> new Prenda(Tipo.CAMISA, null, Prenda.Color.AZUL));
        assertThrows(PrendaException.class, () -> new Prenda(null, Prenda.Material.ALGODON, Prenda.Color.AZUL));
        assertThrows(PrendaException.class, () -> new Prenda(Tipo.CAMISA, Prenda.Material.ALGODON, null));
        assertThrows(PrendaException.class, () -> new Prenda(Tipo.CAMISA, null, Prenda.Color.AZUL, Prenda.Color.NEGRO));
    }
}

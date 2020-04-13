public class Prenda {

    enum Material {
        ALGODON,
        JEAN,
        CUERO,
        METAL
        // Etc
    }
    enum Color {
        ROJO,
        AZUL,
        VERDE,
        NEGRO
        // Etc
    }

    private Tipo tipo;
    private Material material;
    private Color color;
    private Color colorSecundario;

    public Prenda(Tipo tipo, Material material, Color color) {
        if(tipo == null || material == null || color == null)
            throw new PrendaException();

        this.tipo = tipo;
        this.material = material;
        this.color = color;
    }

    public Prenda(Tipo tipo, Material material, Color color, Color colorSecundario) {
        this(tipo, material, color);
        this.colorSecundario = colorSecundario;
    }

    public CategoriaPrenda getCategoria() {
        return tipo.getCategoria();
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }
}

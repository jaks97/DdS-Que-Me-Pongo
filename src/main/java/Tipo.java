public enum Tipo {
    ZAPATO(CategoriaPrenda.CALZADO),
    CAMISA(CategoriaPrenda.SUPERIOR),
    PANTALON(CategoriaPrenda.INFERIOR),
    ANTEOJOS(CategoriaPrenda.ACCESORIO);


    private final CategoriaPrenda CATEGORIA;

    Tipo(CategoriaPrenda categoria) {
        CATEGORIA = categoria;
    }

    public CategoriaPrenda getCategoria() {
        return CATEGORIA;
    }
}
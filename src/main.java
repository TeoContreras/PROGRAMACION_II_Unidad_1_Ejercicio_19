public class main {
    public static void main(String[] args) {
        ArticuloLibreria articulo = new ArticuloLibreria("Cuaderno", 2500, 20);

        articulo.aplicarAumento(15);
        articulo.vender(5);
        articulo.mostrarEstado();
    }
}

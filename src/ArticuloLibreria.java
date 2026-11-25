public class ArticuloLibreria {
    private String descripcion;
    private double precioUnitario;
    private int stock;

    public ArticuloLibreria(String descripcion, double precioUnitario, int stock) {
        this.descripcion = descripcion;

        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        } else {
            this.precioUnitario = 0;
            System.out.println("El precio no puede ser negativo.");
        }

        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
            System.out.println("El stock no puede ser negativo.");
        }
    }

    public void aplicarAumento(double porcentaje) {
        if (porcentaje >= 0) {
            precioUnitario = precioUnitario + (precioUnitario * porcentaje / 100);
        } else {
            System.out.println("El porcentaje no puede ser negativo.");
        }
    }

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta realizada correctamente.");
        } else {
            System.out.println("No hay stock suficiente para realizar la venta.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Articulo: " + descripcion);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Stock disponible: " + stock);
    }
}

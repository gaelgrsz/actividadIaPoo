public class ArticuloInventario {

    private String nombreArticulo;
    private double precioUnitario;
    private int cantidadStock;

    public ArticuloInventario(String nuevoNombre, double nuevoPrecio, int nuevoStock) {
        this.nombreArticulo = nuevoNombre;
        this.precioUnitario = nuevoPrecio;
        this.cantidadStock = nuevoStock;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nuevoNombre) {
        this.nombreArticulo = nuevoNombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precioUnitario = nuevoPrecio;
        }
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int nuevoStock) {
        if (nuevoStock >= 0) {
            this.cantidadStock = nuevoStock;
        }
    }

    public double calcularSubtotal() {
        return cantidadStock * precioUnitario;
    }

    public double calcularValorConDescuento(double porcentajeDescuento) {
        double subtotal = calcularSubtotal();
        double montoDescuento = subtotal * (porcentajeDescuento / 100.0);
        return subtotal - montoDescuento;
    }

    public void mostrarDetalleInventario(double porcentajeDescuento) {
        double totalCalculado = calcularValorConDescuento(porcentajeDescuento);
        System.out.println("Articulo: " + nombreArticulo + " | Stock: " + cantidadStock);
        System.out.println("Total inventario valorizado: $" + totalCalculado);
    }

    
    public static void main(String[] args) {
        ArticuloInventario item = new ArticuloInventario("Laptop Pro", 12500.0, 8);

        item.mostrarDetalleInventario(10.0);
    }
}
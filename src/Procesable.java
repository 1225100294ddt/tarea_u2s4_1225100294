public interface Procesable {

    double TASA_SERVICIO = 0.02;

    void procesar(String metodoPago);

    boolean validar();

    String generarRecibo();

    default double calcularCargo() {
        if (this instanceof Pago) {
            return ((Pago) this).total() * TASA_SERVICIO;
        }
        return 0;
    }

    static String formatearMonto(double m) {
        return String.format("$%.2f", m);
    }
}
public class PagoInscripcion extends Pago {

    private int cuatrimestre;

    public PagoInscripcion(String concepto,
                           String fecha,
                           int cuatrimestre) {
        super(concepto, fecha);
        this.cuatrimestre = cuatrimestre;
    }

    @Override
    public double total() {

        if (cuatrimestre <= 3) {
            return 2500.0;
        }

        return 3200.0;
    }

    @Override
    public String toString() {
        return "PagoInscripcion{" +
                "folio='" + folio + '\'' +
                ", cuatrimestre=" + cuatrimestre +
                ", total=" + total() +
                '}';
    }
}

public class MultaBiblioteca extends Pago {

    private int diasRetraso;
    private double precioLibro;

    public MultaBiblioteca(String concepto,
                           String fecha,
                           int diasRetraso,
                           double precioLibro) {

        super(concepto, fecha);
        this.diasRetraso = diasRetraso;
        this.precioLibro = precioLibro;
    }

    @Override
    public double total() {

        double multa = diasRetraso * 5.0;

        if (diasRetraso > 15) {
            multa += precioLibro * 0.10;
        }

        return multa;
    }

    @Override
    public String toString() {
        return "MultaBiblioteca{" +
                "folio='" + folio + '\'' +
                ", diasRetraso=" + diasRetraso +
                ", total=" + total() +
                '}';
    }
}
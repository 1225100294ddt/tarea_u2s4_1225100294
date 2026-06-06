import java.util.ArrayList;

public class PagoMaterial extends Pago {

    private ArrayList<Double> materiales;

    public PagoMaterial(String concepto,
                        String fecha,
                        ArrayList<Double> materiales) {

        super(concepto, fecha);
        this.materiales = materiales;
    }

    @Override
    public double total() {

        double suma = 0;

        for (double monto : materiales) {
            suma += monto;
        }

        return suma;
    }

    @Override
    public String toString() {
        return "PagoMaterial{" +
                "folio='" + folio + '\'' +
                ", total=" + total() +
                '}';
    }
}
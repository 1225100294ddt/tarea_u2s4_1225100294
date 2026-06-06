import java.util.ArrayList;

public class Main {

    public static void procesarTodos(
            Procesable[] pagos) {

        double totalCobrado = 0;
        double totalCargos = 0;

        for (Procesable p : pagos) {

            p.procesar("Efectivo");

            if (p instanceof Pago) {

                Pago pago = (Pago) p;

                totalCobrado += pago.total();
                totalCargos += p.calcularCargo();
            }
        }

        System.out.println("\n----- RESUMEN -----");
        System.out.println("Total cobrado: "
                + Procesable.formatearMonto(totalCobrado));

        System.out.println("Total cargos: "
                + Procesable.formatearMonto(totalCargos));
    }

    public static void main(String[] args) {

        ArrayList<Double> materiales1 =
                new ArrayList<>();

        materiales1.add(300.0);
        materiales1.add(450.0);
        materiales1.add(250.0);

        ArrayList<Double> materiales2 =
                new ArrayList<>();

        materiales2.add(500.0);
        materiales2.add(200.0);

        Procesable[] pagos = {

                new PagoInscripcion(
                        "Inscripción 1A",
                        "2024-08-01",
                        1),

                new PagoInscripcion(
                        "Inscripción 5A",
                        "2024-08-01",
                        5),

                new PagoMaterial(
                        "Materiales Programación",
                        "2024-08-03",
                        materiales1),

                new PagoMaterial(
                        "Materiales Redes",
                        "2024-08-05",
                        materiales2),

                new MultaBiblioteca(
                        "Multa Libro Java",
                        "2024-08-07",
                        20,
                        600)
        };

        procesarTodos(pagos);
    }
}
import java.util.ArrayList;

public class EstudioContable {
    public void procesarTrabajadores(ArrayList<Trabajador> trabajadores) {
        double total = 0;
        System.out.println("---- reporte de impuestos ----");
        for (Trabajador trabajador : trabajadores) {
            double impuesto = trabajador.calcularImpuesto();
            System.out.println("nombre: " + trabajador.getNombre());
            System.out.println("CUIL: " + trabajador.getCuil());
            System.out.println("impuesto: " + impuesto);
            total += impuesto;
            System.out.println("------------------------------");
            System.out.println("total recaudado: " + total);
        }
    }
}

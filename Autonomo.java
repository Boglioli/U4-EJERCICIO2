public class Autonomo extends Trabajador {
    public Autonomo(String nombre, String cuil, double ingreso) {
        super(nombre, cuil, ingreso);
    }

    @Override
    public double calcularImpuesto() {
        return ingreso * 0.15;
    }
}

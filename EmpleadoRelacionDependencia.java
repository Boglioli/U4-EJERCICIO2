public class EmpleadoRelacionDependencia extends Trabajador {
    public EmpleadoRelacionDependencia(String nombre, String cuil, double ingreso) {
        super(nombre, cuil, ingreso);
    }

    @Override
    public double calcularImpuesto() {
        return ingreso * 0.10;
    }
}

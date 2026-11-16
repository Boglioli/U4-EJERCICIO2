public class DirectorEmpresa extends Trabajador {
    public DirectorEmpresa(String nombre, String cuil, double ingreso) {
        super(nombre, cuil, ingreso);
    }

    @Override
    public double calcularImpuesto() {
        return ingreso * 0.20;
    }
}

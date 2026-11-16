public abstract class Trabajador {
    protected String nombre;
    protected String cuil;
    protected double ingreso;

    public Trabajador(String nombre, String cuil, double ingreso) {
        this.nombre = nombre;
        this.cuil = cuil;
        this.ingreso = ingreso;
    }

    public abstract double calcularImpuesto();

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public double getIngreso() {
        return ingreso;
    }
}

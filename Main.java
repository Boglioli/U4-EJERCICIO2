import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        trabajadores.add(new EmpleadoRelacionDependencia("Juan Perez", "20-12345678-9", 500000));
        trabajadores.add(new Autonomo("Maria Lopez", "27-98765432-1", 600000));
        trabajadores.add(new DirectorEmpresa("Carlos Gomez", "23-45678901-2", 1000000));

        EstudioContable estudio = new EstudioContable();
        estudio.procesarTrabajadores(trabajadores);
    }
}

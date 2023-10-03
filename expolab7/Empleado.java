
package expolab7;

public class Empleado {
    private final String nombre;
    private final Departamento departamento; 

    public Empleado(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento.getNombre();
    }
}

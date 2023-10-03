
import expolab7.Departamento;
import expolab7.Empleado;


public class Test {
    public static void main(String[] args) {
        
        Departamento ventas = new Departamento("Ventas");
        Departamento marketing = new Departamento("Marketing");
        Empleado empleado1 = new Empleado("Juan", ventas);
        Empleado empleado2 = new Empleado("Maria", marketing);

        System.out.println(empleado1.getNombre() + " trabaja en el departamento de " + empleado1.getDepartamento());
        System.out.println(empleado2.getNombre() + " trabaja en el departamento de " + empleado2.getDepartamento());
    }
}

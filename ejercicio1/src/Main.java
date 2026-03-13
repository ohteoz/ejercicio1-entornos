import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();


        empleados.add(new Empleado("Ana", 2000));
        empleados.add(new Programador("Luis", 2500, "Java"));
        empleados.add(new Gerente("Marta", 3000, "Recursos Humanos"));

        // Recorremos la lista (POLIMORFISMO)
        for (Empleado e : empleados) {
            System.out.println(e);
            System.out.println("Salario final: " + e.calcularSalario() + "€");
        }
    }
}
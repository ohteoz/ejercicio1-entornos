public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salarioBase, String departamento) {
        super(nombre, salarioBase);
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + 500;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
}
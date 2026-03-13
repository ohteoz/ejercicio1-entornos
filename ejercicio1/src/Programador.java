public class Programador extends Empleado {
    private String lenguajeDominante;

    public Programador(String nombre, double salarioBase, String lenguajeDominante) {
        super(nombre, salarioBase);
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lenguaje: " + lenguajeDominante;
    }
}
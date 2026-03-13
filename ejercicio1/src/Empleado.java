public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario Base: " + salarioBase + "€";
    }
    public void bono(String tipoBono){

        switch (tipoBono.toLowerCase()) {

            case "productividad":
                salarioBase += 300;
                System.out.println(nombre + " recibió bono de productividad (+300€)");
                break;

            case "antiguedad":
                salarioBase += 500;
                System.out.println(nombre + " recibió bono de antigüedad (+500€)");
                break;

            case "excelencia":
                salarioBase += 700;
                System.out.println(nombre + " recibió bono de excelencia (+700€)");
                break;

            default:
                System.out.println("Tipo de bono no válido");
        }
    }


    public void bono(double cantidad) {
        salarioBase += cantidad;
        System.out.println(nombre + " recibió un bono directo de +" + cantidad + "€");
    }
}
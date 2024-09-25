public class Cocinero extends Trabajador{

    private int salario;
    private final int horasTrabajadas = 40;
    private final int euroHora = 20;

    public Cocinero(String nombre, int edad) {
        super(nombre, edad);
        this.salario = this.calcularSalario();

    }


    public int getSalario() {
        return this.salario;
    }

 

    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }



    @Override
    public int calcularSalario() {
        salario = euroHora * horasTrabajadas;
        return salario;
    }


    @Override
    public String toString() {
        String padre = super.toString();
        return padre + "{" +
            " salario='" + getSalario() + "'" +
            ", horasTrabajadas='" + getHorasTrabajadas() + "'" +
            "}";
    }

    
}
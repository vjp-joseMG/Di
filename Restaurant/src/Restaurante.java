import java.util.Scanner;

public class Restaurante {

private Trabajador [] trabajadores;
private static int ocupacion;

    public Restaurante() {
        this.trabajadores = new Trabajador[5];
        ocupacion = 0;
    }

    public boolean contratarUnTrabajador(){
        Scanner dato = new Scanner(System.in);
        boolean cocina = true;
        System.out.println("aniadir:\n 1 - Cocinero\n 2 - camarero");
        int opc = Integer.parseInt(dato.nextLine());
        if(opc){
            System.out.println("Introduzca el nombre");
            String nombre = dato.nextLine();
            System.out.println("Introduzca la edad");
            int edad = Integer.parseInt(dato.nextLine());

            this.trabajadores[ocupacion] = new Cocinero()

        }


        System.out.println("Introduca el nombre:");
        

        return cocina;
    }



}
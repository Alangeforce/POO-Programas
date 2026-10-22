// Practica 13 - POO - Herencia de clases e interfaces
public class p124_Vehiculo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Sedan sedan = new Sedan("Sedan", "Vochito", "María Díaz", 4);
        System.out.println(sedan);
        sedan.encender();
        sedan.desplazarse();
        sedan.carroceriaTres();
        sedan.chasisMonocasco();
        sedan.repostar();
        sedan.arrancar();
        sedan.frenar();

        Suv suv = new Suv("Suv", "La Mamalona", "Carlos Castañeda", 6);
        System.out.println(suv);
        suv.encender();
        suv.desplazarse();
        suv.traccion4x4();
        suv.chasisIndependiente();
        suv.repostar();
        suv.arrancar();
        suv.frenar();
    }
}

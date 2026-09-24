package p094_Empleado01;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(); // instanciar una clase


        empleado1.setNombre ("Juan") ;
        empleado1.setEdad(30);

        Empleado empleado2 = new Empleado();
        empleado2.setNombre ("Maria") ;
        empleado2.setEdad(25);

        Empleado empleado3 = new Empleado("Juan Luis", 45); //llamamos al constructor

        System.out.println("\nDatos de empleado 1");
        System.out.println("Nombre : " + empleado1.getNombre());
        System.out.println("edad : " + empleado1.getEdad());

        System.out.println(empleado1.toString());

        System.out.println("\nDatos de empleado 2");
        System.out.println("Nombre : " + empleado2.getNombre());
        System.out.println("edad : " + empleado2.getEdad());
        System.out.println(empleado2.toString());

        System.out.println("Empleado 3: " + empleado3.toString());

        System.out.println("\nEl promedio de edad es : ");
        System.out.println( (empleado1.getEdad() + empleado2.getEdad() + empleado3.getEdad()) / 3);
    }


}

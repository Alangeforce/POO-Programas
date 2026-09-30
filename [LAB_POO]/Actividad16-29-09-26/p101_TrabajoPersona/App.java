package p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Carlos Cataneda", new Trabajo("Profesor", 1, 5000)),
                new Persona("Lourdes Santoyo", new Trabajo("Intendente", 2, 10000)),
                new Persona("Lourdes Santoyo", new Trabajo("Intendente", 3, 2500)),
                new Persona("Maria Lopez", new Trabajo("Cocinera", 4, 2500))
        };

        double totalSalarios = 0;

        for (Persona persona : personas) {
            System.out.println(persona);
            totalSalarios += persona.getTrabajo().getSalario();
        }

        System.out.println("Total de personas: " + personas.length);
        System.out.println("Total de salarios: " + totalSalarios);
    }
}

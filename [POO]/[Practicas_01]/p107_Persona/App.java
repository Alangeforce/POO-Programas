package p107_Persona;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Estudiante e1 = new Estudiante();
        e1.setPersona(new Persona("Juan Perez", "Calle 123, Col. Centro"));
        e1.setCarrera("Sistemas");
        e1.setAño(2);
        e1.setColegiatura(1500.0);
        System.out.println(e1);

        Estudiante e2 = new Estudiante(new Persona("Maria Lopez", "Av. Juarez 456"), "Industrial", 3, 1800.5);
        System.out.println(e2);

        Apoyo a1 = new Apoyo();
        a1.setPersona(new Persona("Carlos Ruiz", "Calle Hidalgo 789"));
        a1.setEscolaridad("Preparatoria");
        a1.setPaga(2500.0);
        System.out.println(a1);

        Apoyo a2 = new Apoyo(new Persona("Ana Torres", "Blvd. Lopez 321"), "Universidad", 3200.75);
        System.out.println(a2);
    }
}

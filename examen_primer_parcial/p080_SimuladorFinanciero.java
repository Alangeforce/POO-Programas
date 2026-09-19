import java.util.Scanner;

/**
 * Archivo: p080_SimuladorFinanciero.java
 * Programa: p080_SimuladorFinanciero.
 * Materia: Programacion Orientada a Objetos 1 y Laboratorio.
 *
 * Simula planes de ahorro, inversiones a plazo fijo y perfiles de inversionista.
 */
public class p080_SimuladorFinanciero {

    /**
     * Calcula el monto final de un ahorro programado aplicando interes mensual.
     *
     * @param aportacion cantidad que se deposita cada mes
     * @param meses numero total de meses del plan
     * @param tasaAnual tasa anual expresada como decimal, por ejemplo 0.05 para 5%
     * @return monto acumulado al finalizar el periodo
     */
    public static double calcularAhorro(double aportacion, int meses, double tasaAnual) {
        if (aportacion <= 0 || meses <= 0 || tasaAnual <= 0) {
            return -1;
        }

        double saldo = 0;
        double tasaMensual = tasaAnual / 12;

        for (int mes = 1; mes <= meses; mes++) {
            saldo += aportacion;
            saldo += saldo * tasaMensual;
        }

        return saldo;
    }

    /**
     * Calcula el monto final de una inversion usando interes compuesto.
     *
     * @param capital cantidad inicial invertida
     * @param tasa tasa anual expresada como decimal, por ejemplo 0.08 para 8%
     * @param anios duracion de la inversion en anios
     * @return monto acumulado al finalizar el plazo
     */
    public static double calcularInteresCompuesto(double capital, double tasa, int anios) {
        if (capital <= 0 || tasa <= 0 || anios <= 0) {
            return -1;
        }

        return capital * Math.pow(1 + tasa, anios);
    }

    /**
     * Clasifica el perfil de inversionista segun edad y monto disponible.
     *
     * @param edad edad del usuario
     * @param monto capital disponible para invertir
     * @return perfil de inversionista: No elegible, Agresivo, Conservador o Moderado
     */
    public static String obtenerPerfil(int edad, double monto) {
        if (edad <= 0 || monto <= 0) {
            return "Datos invalidos";
        }

        if (monto < 10000) {
            return "No elegible";
        } else if (edad < 30 && monto > 10000) {
            return "Agresivo";
        } else if (edad > 50) {
            return "Conservador";
        } else {
            return "Moderado";
        }
    }

    /**
     * Convierte una tasa porcentual capturada por el usuario a formato decimal.
     *
     * @param tasaPorcentaje tasa expresada como porcentaje, por ejemplo 5 para 5%
     * @return tasa en formato decimal
     */
    public static double convertirTasaADecimal(double tasaPorcentaje) {
        if (tasaPorcentaje <= 0) {
            return -1;
        }

        return tasaPorcentaje / 100;
    }

    /**
     * Lee un numero decimal desde consola y evita errores por entradas no numericas.
     *
     * @param scanner objeto Scanner usado para capturar datos
     * @param mensaje texto que se muestra al usuario
     * @return numero decimal capturado
     */
    public static double leerDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);

        while (!scanner.hasNextDouble()) {
            System.out.println("Error: ingrese un numero valido.");
            scanner.next();
            System.out.print(mensaje);
        }

        return scanner.nextDouble();
    }

    /**
     * Lee un numero entero desde consola y evita errores por entradas no numericas.
     *
     * @param scanner objeto Scanner usado para capturar datos
     * @param mensaje texto que se muestra al usuario
     * @return numero entero capturado
     */
    public static int leerInt(Scanner scanner, String mensaje) {
        System.out.print(mensaje);

        while (!scanner.hasNextInt()) {
            System.out.println("Error: ingrese un numero entero valido.");
            scanner.next();
            System.out.print(mensaje);
        }

        return scanner.nextInt();
    }

    /**
     * Punto de entrada del programa. Muestra un menu interactivo y procesa opciones.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== p080 Simulador Financiero ===");
            System.out.println("1. Plan de Ahorro Programado");
            System.out.println("2. Proyeccion de Inversion a Plazo Fijo");
            System.out.println("3. Clasificador de Perfil de Inversionista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: ingrese un numero entero del 1 al 4.");
                scanner.next();
                System.out.print("Seleccione una opcion: ");
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double aportacion = leerDouble(scanner, "Ingrese la aportacion mensual: ");

                    int meses = leerInt(scanner, "Ingrese el numero de meses: ");

                    double tasaAhorro = convertirTasaADecimal(
                            leerDouble(scanner, "Ingrese la tasa anual en porcentaje (ej. 5 para 5%): "));

                    if (aportacion <= 0 || meses <= 0 || tasaAhorro <= 0) {
                        System.out.println("Error: los montos, meses y tasas deben ser mayores que cero.");
                    } else {
                        double totalAhorro = calcularAhorro(aportacion, meses, tasaAhorro);
                        System.out.printf("Monto final acumulado: $%.2f%n", totalAhorro);
                    }
                    break;

                case 2:
                    double capital = leerDouble(scanner, "Ingrese el capital inicial: ");

                    double tasaInversion = convertirTasaADecimal(
                            leerDouble(scanner, "Ingrese la tasa anual en porcentaje (ej. 8 para 8%): "));

                    int anios = leerInt(scanner, "Ingrese el numero de anios: ");

                    if (capital <= 0 || tasaInversion <= 0 || anios <= 0) {
                        System.out.println("Error: el capital, la tasa y los anios deben ser mayores que cero.");
                    } else {
                        double totalInversion = calcularInteresCompuesto(capital, tasaInversion, anios);
                        System.out.printf("Monto final de la inversion: $%.2f%n", totalInversion);
                    }
                    break;

                case 3:
                    int edad = leerInt(scanner, "Ingrese su edad: ");

                    double monto = leerDouble(scanner, "Ingrese el capital disponible: ");

                    if (edad <= 0 || monto <= 0) {
                        System.out.println("Error: la edad y el monto deben ser mayores que cero.");
                    } else {
                        String perfil = obtenerPerfil(edad, monto);
                        System.out.println("Perfil de inversionista: " + perfil);
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el simulador financiero.");
                    break;

                default:
                    System.out.println("Opcion invalida. Seleccione un numero del 1 al 4.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}

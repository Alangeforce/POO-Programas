package p111_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        // 1. CuentaBancaria: saldos esperados 5000 -> 15000 -> 14944
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.deposita(10000);
        System.out.println(cuenta1.getSaldo());
        boolean retiro = cuenta1.retira(56);
        System.out.println(retiro);
        System.out.println(cuenta1.getSaldo());

        // 2. Cliente: el retiro de 50 se invoca una sola vez; saldo final 950
        Cliente cliente1 = new Cliente("Juan Perez", cuenta1);
        Cliente cliente2 = new Cliente("Carlos Castaneda", new CuentaBancaria(1000));
        boolean retiro2 = cliente2.getCuenta().retira(50);
        System.out.println(retiro2);
        System.out.println(cliente2);

        // 3. Banco: registrar clientes
        Banco banco = new Banco("Banco Patito", "Arboledas 124");
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Felipe Correa", new CuentaBancaria(2000));
        banco.agregarCliente(cliente3);

        // El retiro de 1000 sobre 950 falla y conserva el saldo
        cliente1.getCuenta().deposita(1500);
        boolean retiro3 = cliente2.getCuenta().retira(1000);
        System.out.println(retiro3);
        cliente3.getCuenta().deposita(12000);

        // 4. Recorrer la lista y sumar
        double total = 0;
        for (Cliente cliente : banco.getClientes()) {
            System.out.println(cliente);
            total += cliente.getCuenta().getSaldo();
        }
        System.out.println(banco);
        System.out.println("Total=" + total);
    }
}

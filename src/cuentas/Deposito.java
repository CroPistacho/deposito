package cuentas;

public class Deposito {

    public static void main(String[] args) {
        operativa_cuenta(1000);
    }

    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio Lopez", "1000-2365-85-123456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar.");
        }
        try {
            System.out.println("Ingreso en cuenta.");
            cuenta1.ingresar(695);
        } catch (Exception r) {
            System.out.println("Fallo al ingresar.");
        }
    }

}

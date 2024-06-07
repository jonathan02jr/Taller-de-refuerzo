package Proyect_Datos_Quemados;

public class Main {
    public static void main(String[] args){

        CuentaBancaria cuenta1 = new CuentaBancaria(23456783);
        System.out.println("Cuenta bancaria");
        cuenta1.mostrar_info();
        cuenta1.setSaldo(300);
        System.out.println("Su saldo actual es: "+cuenta1.getSaldo());


        CuentaCorriente cuenta2 = new CuentaCorriente(12345,50);
        System.out.println("\nCuenta Corriente");
        double retiro1= 40, retiro2=150;
        if (retiro1 <= 100) {
            System.out.println("--- Caso N° 1 ---");
            cuenta2.info_compartir();
            System.out.println("Valor a retirar: " + retiro1);
            System.out.println("Retiro realizado de manera exitosa");
        }
        if (retiro2>100){
            System.out.println("\n--- Caso N° 2 ---");
            cuenta2.info_compartir();
            System.out.println("Valor a retirar: " + retiro2);
            System.out.println("Ha sobrepasado el moto a retirar");
            cuenta2.retirar();
        }

        CuentaAhorros cuenta3 = new CuentaAhorros(12345,6.5);
        System.out.println("\nCuenta De Ahorros");



    }
}

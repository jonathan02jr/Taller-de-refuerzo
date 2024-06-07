package Proyect_Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria2 cuenta = new CuentaBancaria2(123456, 0.0);
        System.out.println("----BIENVENIDO AL BANCO EPN----");
        int opcion2;
        do{
            System.out.println("Ingrese la opcion que desees: ");
            System.out.println("1) Cuenta Corriente ");
            System.out.println("2) Cuenta Ahorros");
            System.out.println("3) Salir");
            opcion2 = scanner.nextInt();
            scanner.nextLine();

            switch (opcion2){
                case 1: System.out.println("Cuenta Corriente");
                System.out.println("---CUENTA CORRIENTE---");
                    Scanner scanner2 = new Scanner(System.in);
                    int opcion;
                    do {
                        System.out.println("Ingrese la opción que desees:");
                        System.out.println("1) Obtener número de cuenta");
                        System.out.println("2) Ver tu saldo inicial");
                        System.out.println("3) Depositar");
                        System.out.println("4) Retirar");
                        System.out.println("5) Salir");
                        opcion = scanner2.nextInt();
                        scanner2.nextLine();

                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese su número de cédula para obtener su número de cuenta:");
                                String cedula = scanner.nextLine();

                                cuenta.mostrarNumeroCuenta();
                                System.out.println("-----------");
                                break;
                            case 2:
                                cuenta.mostrarSaldo();
                                break;
                            case 3:
                                System.out.println("Ingrese la cantidad a depositar:");
                                double deposito = scanner.nextDouble();
                                cuenta.depositar(deposito);
                                System.out.println("-----------");
                                break;
                            case 4:
                                System.out.println("Ingrese la cantidad a retirar:");
                                double retiro = scanner.nextDouble();
                                cuenta.retirar(retiro);
                                System.out.println("-----------");
                                break;
                            case 5:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                                break;
                        }
                    } while (opcion != 5);

                    scanner.close();


                case 2: System.out.println("Cuenta Ahorros");

            }

        }while (opcion2 != 3);


    }

}





/*int opcion;
        do {
            System.out.println("Ingrese la opción que desees:");
            System.out.println("1) Obtener número de cuenta");
            System.out.println("2) Ver tu saldo inicial");
            System.out.println("3) Depositar");
            System.out.println("4) Retirar");
            System.out.println("5) Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su número de cédula para obtener su número de cuenta:");
                    String cedula = scanner.nextLine();

                    cuenta.mostrarNumeroCuenta();
                    System.out.println("-----------");
                    break;
                case 2:
                    cuenta.mostrarSaldo();
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    System.out.println("-----------");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    System.out.println("-----------");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();

 */




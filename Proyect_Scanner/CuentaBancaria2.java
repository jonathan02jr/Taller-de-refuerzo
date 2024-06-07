package Proyect_Scanner;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class CuentaBancaria2 {
    private int numeroCuenta ;
    private double saldo;
    private double montoDeposito;

    // Metodo Constructor

    public CuentaBancaria2(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    // Getters and Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMontoDeposito() {
        return montoDeposito;
    }

    public void setMontoDeposito(double montoDeposito) {
        this.montoDeposito = montoDeposito;
    }
    // Metodos

    public void CuentaBancaria(int numeroCuenta){

    }
    public void mostrarNumeroCuenta(){
        System.out.println("Su numero de cuenta es: "+getNumeroCuenta());
    }
    public void mostrarSaldo(){
        System.out.println("Su saldo actual es de " + getSaldo());
    }
    public void depositar(double montoDeposito){
        saldo += montoDeposito;
        System.out.println("Depósito exitoso. Su nuevo saldo es: " + getSaldo());
    }
    public void retirar(double montoRetiro){
        saldo -= montoRetiro;
        System.out.println("Retiro exitoso. Su nuevo saldo es: " + getSaldo());
    }
}


class cuentaCorriente extends CuentaBancaria2{
    private double montoMaximo;
    //Metodo Constructor

    public cuentaCorriente(int numeroCuenta, double saldo, double montoMaximo) {
        super(numeroCuenta, saldo);
        this.montoMaximo = montoMaximo;
    }


    //Gettes y Setter


    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    @Override
    public void setNumeroCuenta(int numeroCuenta) {
        super.setNumeroCuenta(numeroCuenta);
        System.out.println("Su numero de cuenta es: "+getNumeroCuenta());
        System.out.println("El monto maximo que puede Sobregirar es de 100 ");
    }

    //Metodos
    @Override
    public void mostrarNumeroCuenta() {

    }

    public void retiroVerifi(double monto) {
        if (monto > 100) {
            System.out.println("Su monto de retiro debe ser menor o igual a 100");
        } else {
            if (getSaldo() - monto >= -montoMaximo) {
                setSaldo(getSaldo() - monto);
                System.out.println("Retiro exitoso. Su nuevo saldo es: " + getSaldo());
            } else {
                System.out.println("No tiene suficiente saldo y sobregiro disponible para este retiro.");
            }
        }
    }
}

class CuentaAhorro extends CuentaBancaria2{
    private  double tasaInteres; //Tasa de interes aplicable al saldo 17%

    //Metodo Construntor

    public CuentaAhorro(int numeroCuenta, double saldo, double tasaInteres) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    //Getters y Setters

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    //Metodos
    @Override
    public void mostrarNumeroCuenta(){
        //Main
        System.out.println("Su numero de cuenta es: "+getNumeroCuenta());
        System.out.println("Su tasa de interes es del: "+getTasaInteres());
    }

    // Método para calcular el interés acumulado y agregarlo al saldo.
    public void aplicarInteres() {
        double interes = getSaldo() * tasaInteres;
        setSaldo(getSaldo() + interes);
        System.out.println("Interés aplicado. Su nuevo saldo es: " + getSaldo());
    }


}



//metodo de menu para llamar en main
/*
public void menu2(){
    Scanner scanner = new Scanner(System.in);
    int opcion;
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
}*/